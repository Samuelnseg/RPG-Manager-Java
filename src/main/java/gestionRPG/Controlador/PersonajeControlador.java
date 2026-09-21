package gestionRPG.Controlador;
import gestionRPG.Modelo.PersonajeDAO;
import gestionRPG.Modelo.Personaje;
import java.util.*;
import io.javalin.http.Context;

public class PersonajeControlador {
    private static PersonajeDAO pdao = new PersonajeDAO();
    
    public static void obtenerPersonajes(Context ctx){
        ArrayList<Personaje> personajes = new ArrayList<>();
        personajes = pdao.listaDePersonajes();
        
        ctx.json(personajes);
    }
}
