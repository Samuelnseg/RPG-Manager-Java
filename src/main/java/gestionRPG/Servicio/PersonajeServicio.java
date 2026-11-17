package gestionRPG.Servicio;
import gestionRPG.Modelo.*;
import java.util.ArrayList;

public class PersonajeServicio {
    private PersonajeDAO dao = new PersonajeDAO();
    
    public boolean agregarPersonaje (String nom, String clase, int nivel, int vida){
        if (nom.trim().equals("")){ 
            return false;
        }
        
        if (clase.trim().equals("")){
            return false;
        }
        
        if (vida < 0){
            return false;
        }
        
        if (nivel < 1 || nivel > 100){
            return false;
        }
        
        if (!clase.equals("Mago") && !clase.equals("Guerrero") && !clase.equals("Arquero")){
            return false;
        }
        
        Personaje p = new Personaje(nom, clase, nivel, vida);
        dao.agregarPersonaje(p);
        return true;
    }
    
    public ArrayList<Personaje> obtenerPersonaje (){
        return dao.obtenerPersonajes();
    }
}
