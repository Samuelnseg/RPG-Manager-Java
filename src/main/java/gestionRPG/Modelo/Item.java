package gestionRPG.Modelo;

// Archivo: rpg_manager_multinivel_javalin/src/main/java/gestionrpg/modelo/Item.java (clase completa)

/** Un ítem dentro del inventario de un personaje. */
public class Item {

    private final String nombre;
    private final String tipo;
    private final int valor;
    private final int cantidad;

    public Item(String nombre, String tipo, int valor, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
        this.cantidad = cantidad;
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public int getValor() { return valor; }
    public int getCantidad() { return cantidad; }

    @Override
    public String toString() { return "Item(" + nombre + " x" + cantidad + ")"; }
}