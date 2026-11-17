package gestionRPG.Controlador;
import gestionRPG.Modelo.Personaje;
import gestionRPG.Servicio.PersonajeServicio;
import java.util.ArrayList;

public class PersonajeControlador {
    private PersonajeServicio ps = new PersonajeServicio();
    
    public String agregarPersonaje (String nom, String c, int n, int v) {
        if (ps.agregarPersonaje(nom, c, n, v)){
            return "Personaje agregado";
        }
        return "El personaje no es valido";
    }
    
    public ArrayList<Personaje> obtener_personajes (){
        return ps.obtenerPersonaje();
    }
}
