package gestionRPG;



import gestionRPG.Controlador.PersonajeControlador;
import io.javalin.Javalin;

public class Main {
    public static void main(String[] arg) {
        Javalin app = Javalin.create().start(7070);
        
        app.get("/personajes", ctx -> PersonajeControlador.obtenerPersonajes(ctx));
    }
}