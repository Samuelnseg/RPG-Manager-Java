// Archivo: rpg_manager_multinivel_javalin/src/main/java/gestionrpg/modelo/Personaje.java (fragmento)

package gestionRPG.Modelo;
import java.math.BigDecimal;

abstract class Personaje{
    protected int id;
    protected String nombre;
    protected int nivel;
    protected int vida;
    protected int ataque;
    protected BigDecimal oro;

    protected Personaje(Integer id, String nombre, int nivel, int vida, int ataque, BigDecimal oro) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.ataque = ataque;
        this.oro = oro;
        }

    /** "Guerrero", "Mago" o "Arquero": lo define cada subclase. */
    public abstract String getClase();
}