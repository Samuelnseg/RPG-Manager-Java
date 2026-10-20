package gestionRPG.Modelo;
import java.util.*;

public class PersonajeDAO {
    private static ArrayList<Personaje> listaPersonajes = new ArrayList<>();
    
    public void agregarPersonaje(Personaje p){
        listaPersonajes.add(p);
    } 
    
    public ArrayList<Personaje> listaDePersonajes(){
        return listaPersonajes;
    }
}
