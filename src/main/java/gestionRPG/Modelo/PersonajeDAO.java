package gestionRPG.Modelo;
import java.util.*;

public class PersonajeDAO {
    private static ArrayList<Personaje> listaPersonajes = new ArrayList<>();
    
    public PersonajeDAO () {
        Personaje PMago = new Personaje("Magin", "Mago", 0, 100);
        Personaje PGuerrero = new Personaje("Efrain", "Guerrero", 0, 150);
        listaPersonajes.add(PMago);
        listaPersonajes.add(PGuerrero);
    }
        
    public void agregarPersonaje(Personaje p){
        listaPersonajes.add(p);
    } 
    
    public ArrayList<Personaje> listaDePersonajes(){
        return listaPersonajes;
    }
}
