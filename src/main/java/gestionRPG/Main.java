package gestionRPG;

import io.javalin.Javalin;
import gestionRPG.Modelo.*;

public class Main {
    private static PersonajeDAO dao = new PersonajeDAO();
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7070);

        app.get("/personajes", ctx -> {
            ctx.json(PersonajeDAO.obtenerPersonajes());
        });

        app.post("/personajes", ctx -> {
            Personaje p = ctx.bodyAsClass(Personaje.class);
            dao.agregarPersonaje(p);
        });
    }
}