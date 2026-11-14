package gestionRPG.Modelo;
import java.util.ArrayList;

public class PersonajeDAO {
    static ArrayList<Personaje> personajes = new ArrayList<>();
    
    public void agregarPersonaje(Personaje p){
        personajes.add(p);
    }
    
    public ArrayList<Personaje> obtenerPersonajes(){
        return personajes;
    }
}
