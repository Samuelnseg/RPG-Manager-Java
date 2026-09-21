package gestionRPG;

import gestionRPG.Controlador.PersonajeControlador;
import io.javalin.Javalin;

public class Main {
    
    public static void main(String[] arg) {
        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public");
        }).start(7070);
        app.get("/personajes", ctx -> PersonajeControlador.obtenerPersonajes(ctx));
        app.post("/crear-personaje", PersonajeControlador::crearPersonaje);
                   
    }
}