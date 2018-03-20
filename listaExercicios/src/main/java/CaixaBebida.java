public class CaixaBebida {
    private String marca;
    private String tipo;

    public CaixaBebida(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Caixa de bebida sendo comsumida: [" +
                "marca: " + marca +
                ", tipo: " + tipo + "]";
    }
}
