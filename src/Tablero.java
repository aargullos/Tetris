import java.util.Random;

public class Tablero {
    private int ancho;
    private int alto;
    private Bloque[][] grilla;
    private Pieza piezaActual;

    public Tablero(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.grilla = new Bloque[alto][ancho];
    }

    public void iniciarTablero() {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                grilla[i][j] = null;
            }
        }
        generarNuevaPieza();
    }

    public void actualizarTablero() {
        for (int i = 0; i < alto; i++) {
            boolean filaCompleta = true;
            for (int j = 0; j < ancho; j++) {
                if (grilla[i][j] == null) {
                    filaCompleta = false;
                    break;
                }
            }
            if (filaCompleta) {
                eliminarFila(i);
                i--;
            }
        }
    }

    public void eliminarFila(int fila) {
        for (int i = fila; i > 0; i--) {
            for (int j = 0; j < ancho; j++) {
                grilla[i][j] = grilla[i - 1][j];
            }
        }
        for (int j = 0; j < ancho; j++) {
            grilla[0][j] = null;
        }
    }

    public void agregarPieza(Pieza pieza) {
        this.piezaActual = pieza;
        for (int[] bloque : pieza.getBloques()) {
            grilla[bloque[0]][bloque[1]] = new Bloque(bloque, pieza.getColor());
        }
    }

    public void dibujarTablero() {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (grilla[i][j] != null) {
                    System.out.print("X");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    public void generarNuevaPieza() {
        Random random = new Random();
        String[] formas = {"L", "T", "S", "Z", "J", "I", "O"};
        String forma = formas[random.nextInt(formas.length)];
        piezaActual = new Pieza(forma, new int[]{0, ancho / 2}, "rojo");
        agregarPieza(piezaActual);
    }


    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Bloque[][] getGrilla() {
        return grilla;
    }

    public void setGrilla(Bloque[][] grilla) {
        this.grilla = grilla;
    }

    public Pieza getPiezaActual() {
        return piezaActual;
    }

    public void setPiezaActual(Pieza piezaActual) {
        this.piezaActual = piezaActual;
    }
}
