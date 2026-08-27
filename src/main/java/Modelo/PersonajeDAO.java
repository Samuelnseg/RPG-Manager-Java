package Modelo;
import java.util.*;

public class PersonajeDAO {
    private static ArrayList<Personaje> listaPersonajes = new ArrayList<>();
    
    public void agregarPersonaje(Personaje p){
        if (p.getVida() >= 0 && p.getNivel() >= 0){
            listaPersonajes.add(p);
        }
        else {
            System.out.println("Datos de vida o nivel no validos");
        }
    } 
    
    public ArrayList<Personaje> listaDePersonajes(){
        return listaPersonajes;
    }
}
