public class Skin {
    private String nombre;
    private String rareza;

    public Skin() {
    }

    public Skin(String nombre, String rareza) {
        this.nombre = nombre;
        this.rareza = rareza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre +" rareza= " + rareza;
    }
}
