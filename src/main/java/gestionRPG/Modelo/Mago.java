// Archivo: rpg_manager_multinivel_javalin/src/main/java/gestionrpg/modelo/Mago.java (clase completa)
package gestionRPG.Modelo;
import java.math.BigDecimal;

public class Mago extends Personaje {

    public static final int MANA_POR_DEFECTO = 100;

    private int mana;
    public Mago(Integer id, String nombre, int nivel, int vida, int ataque, BigDecimal oro, int mana) {
        super(id, nombre, nivel, vida, ataque, oro);
        this.mana = mana;
    }

    @Override
    public String getClase() { return "Mago"; }

    public int getMana() { return mana; }
}