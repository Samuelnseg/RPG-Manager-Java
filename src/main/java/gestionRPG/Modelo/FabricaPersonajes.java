// Archivo: rpg_manager_multinivel_javalin/src/main/java/gestionrpg/modelo/FabricaPersonajes.java (fragmento)
package gestionRPG.Modelo;
import java.math.BigDecimal;
    /**
     * @param mana      solo para Mago; null = valor por defecto
     * @param precision solo para Arquero; null = valor por defecto
     */
public class FabricaPersonajes {
    public static Personaje crear(String clase, Integer id, String nombre, int nivel, int vida,
                                int ataque, BigDecimal oro, Integer mana, Integer precision) {
        switch (clase) {
            case "Guerrero":
                return new Guerrero(id, nombre, nivel, vida, ataque, oro);
            case "Mago":
                return new Mago(id, nombre, nivel, vida, ataque, oro,
                        mana != null ? mana : Mago.MANA_POR_DEFECTO);
            case "Arquero":
                return new Arquero(id, nombre, nivel, vida, ataque, oro,
                        precision != null ? precision : Arquero.PRECISION_POR_DEFECTO);
            default:
                throw new IllegalArgumentException("Clase desconocida: " + clase);
        }
    }
}