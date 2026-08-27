package Controlador;
import Modelo.PersonajeDAO;
import Modelo.Personaje;
import java.util.*;

public class PersonajeControlador {
    private static PersonajeDAO pdao = new PersonajeDAO();
    
    public static void obtenerPersonajes(){
        ArrayList<Personaje> personajes = new ArrayList<>();
        personajes = pdao.listaDePersonajes();
    }
}
