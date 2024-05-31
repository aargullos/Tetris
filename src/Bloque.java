public class Bloque {
    private int[] posicion;
    private String color;

    public Bloque(int[] posicion, String color) {
        this.posicion = posicion;
        this.color = color;
    }

    public int[] getPosicion() {
        return posicion;
    }

    public void setPosicion(int[] posicion) {
        this.posicion = posicion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
