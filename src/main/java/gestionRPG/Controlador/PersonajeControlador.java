package gestionRPG.Controlador;
import gestionRPG.Modelo.PersonajeDAO;
import gestionRPG.Modelo.Personaje;
import java.util.*;
import io.javalin.http.Context;

public class PersonajeControlador {
    private static PersonajeDAO pdao = new PersonajeDAO();
    private static ArrayList<Personaje> personajes = new ArrayList<>();
    
    public static void obtenerPersonajes(Context ctx){    
        personajes = pdao.listaDePersonajes();
        ctx.json(personajes);
    }
    
    public static void crearPersonaje(Context ctx) {
        String nombre = ctx.formParam("nombre");
        String clase = ctx.formParam("clase");

        Personaje nuevo = new Personaje(nombre, clase, 1, 100);
        pdao.agregarPersonaje(nuevo);

        ctx.redirect("/personaje.html");
    }
}
