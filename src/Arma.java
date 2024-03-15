public class Arma {
    private String tipo;
    private Integer daño;

    public Arma() {
    }

    public Arma(String tipo, Integer daño) {
        this.tipo = tipo;
        this.daño = daño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getDaño() {
        return daño;
    }

    public void setDaño(Integer daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "tipo= " + tipo +", daño= " + daño;
    }
}
