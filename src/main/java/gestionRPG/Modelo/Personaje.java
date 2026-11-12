package gestionRPG.Modelo;

public class Personaje {
    String nombre;
    String clase;
    int nivel;
    int vida;
    public Personaje(String nombre, String clase, int nivel, int vida){
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = nivel;
        this.vida = vida;
    }
}
