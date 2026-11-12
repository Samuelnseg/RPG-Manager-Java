package gestionRPG.Modelo;
import java.util.ArrayList;

public class PersonajeDAO {
    static ArrayList<Personaje> personajes = new ArrayList<>();
    
    public static void agregarPersonaje(Personaje p){
        personajes.add(p);
    }
    
    public static ArrayList<Personaje> obtenerPersonajes(){
        return personajes;
    }
}
