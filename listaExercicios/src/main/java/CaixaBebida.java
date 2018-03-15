public class CaixaBebida {
    private String marca;
    private String tipo;
    private float volume;

    public CaixaBebida(String marca, String tipo, float volume) {
        this.marca = marca;
        this.tipo = tipo;
        this.volume = volume;
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

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "CaixaBebida{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", volume=" + volume +
                '}';
    }
}
