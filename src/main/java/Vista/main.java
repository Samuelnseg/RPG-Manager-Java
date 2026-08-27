package Vista;
import Controlador.*;
import io.javalin.Javalin;

public class main {
    public static void main(String[] arg){
        Javalin app = Javalin.create(config -> {}).start(7070);
        app.get("/personajes", PersonajeControlador::obtenerPersonajes);
    }
}
