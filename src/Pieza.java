import java.util.ArrayList;
import java.util.List;

public class Pieza {
    private String forma;
    private int[] posicion;
    private String color;
    private List<int[]> bloques;

    public Pieza(String forma, int[] posicion, String color) {
        this.forma = forma;
        this.posicion = posicion;
        this.color = color;
        this.bloques = new ArrayList<>();
        generarBloques();
    }

    private void generarBloques() {
        bloques.clear();
        switch (forma) {
            case "L":
                break;
            case "T":
                break;
            case "S":
                break;
            case "Z":
                break;
            case "J":
                break;
            case "I":
                break;
            case "O":
                break;
            default:
                throw new IllegalArgumentException("Forma desconocida: " + forma);
        }
    }

    public void mover(int deltaX, int deltaY) {
        for (int[] bloque : bloques) {
            bloque[0] += deltaX;
            bloque[1] += deltaY;
        }
    }

    public List<int[]> getBloques() {
        return bloques;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
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
