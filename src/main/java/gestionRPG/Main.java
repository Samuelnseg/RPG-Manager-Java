package gestionRPG;

import io.javalin.Javalin;
import gestionRPG.Modelo.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    private static PersonajeDAO dao = new PersonajeDAO();
    public static void main(String[] args) {
        var app = Javalin.create(config -> {
        config.staticFiles.add("/public");
        }).start(7000);
        

        app.get("/personajes", ctx -> {
            try (InputStream archivo = Main.class
            .getResourceAsStream("/public/index.html")) {

                if (archivo == null) {
                    ctx.status(404).result("No se encontró index.html");
                    return;
                }

                String html = new String(
                    archivo.readAllBytes(),
                    StandardCharsets.UTF_8
                );

                StringBuilder filas = new StringBuilder();

                for (Personaje p : dao.obtenerPersonajes()) {
                    filas.append("<tr>");
                    filas.append("<td>").append(p.getNombre()).append("</td>");
                    filas.append("<td>").append(p.getClase()).append("</td>");
                    filas.append("<td>").append(p.getNivel()).append("</td>");
                    filas.append("<td>").append(p.getVida()).append("</td>");
                    filas.append("</tr>");
                }

                html = html.replace("<!-- PERSONAJES -->", filas.toString());
                ctx.html(html);

            } catch (IOException e) {
                ctx.status(500).result("Error al cargar la página");
            }
        });

        app.post("/personajes", ctx -> {
            Personaje p = new Personaje();
            p.setNombre(ctx.formParam("nombre"));
            p.setClase(ctx.formParam("clase"));
            p.setNivel(Integer.parseInt(ctx.formParam("nivel")));
            p.setVida(Integer.parseInt(ctx.formParam("vida")));
            dao.agregarPersonaje(p);
            ctx.redirect("/personajes");
        });
    }
}