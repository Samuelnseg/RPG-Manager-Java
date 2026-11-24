// Archivo: rpg_manager_multinivel_javalin/src/main/java/gestionrpg/repositorio/RepositorioMariaDB.java (fragmento)

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import gestionRPG.Modelo.Personaje;

public class RepositorioMariaDB {
    private List<Personaje> consultar(String sql, Object... parametros) {
        List<Personaje> resultado = new ArrayList<>();
        try (Connection con = conectar();
            PreparedStatement ps = con.prepareStatement(sql)) {
            for (int i = 0; i < parametros.length; i++) {
                ps.setObject(i + 1, parametros[i]);
            }
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    resultado.add(filaAPersonaje(rs));
                }
            }
        } catch (SQLException e) {
            throw new AccesoDatosException("Error consultando personajes", e);
        }
        return resultado;
    }

    public Personaje buscarPorId(int id) {
        List<Personaje> encontrados = consultar(SELECT_PERSONAJE + " WHERE p.id_personaje = ?", id);
        return encontrados.isEmpty() ? null : encontrados.get(0);
    }
}

