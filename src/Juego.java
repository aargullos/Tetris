import java.util.Scanner;

public class Juego {
    private String estado;
    private int puntaje;
    private int nivel;
    private Tablero tablero;
    private Jugador jugador;
    private Controlador controlador;

    public Juego() {
        this.tablero = new Tablero(10, 20);
        this.jugador = new Jugador("Jugador 1");
        this.controlador = new Controlador(this);
        this.estado = "inactivo";
    }

    public void iniciarJuego() {
        this.estado = "activo";
        this.puntaje = 0;
        this.nivel = 1;
        this.tablero.iniciarTablero();
        System.out.println("Juego iniciado.");
    }

    public void terminarJuego() {
        this.estado = "terminado";
        System.out.println("Juego terminado.");
    }

    public String getEstado() {
        return estado;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void agregarPuntos(int puntos) {
        this.puntaje += puntos;
        jugador.actualizarPuntaje(puntos);
    }

    public static void main(String[] args) {
        Juego juego = new Juego();
        Scanner scanner = new Scanner(System.in);

        while (!juego.getEstado().equals("terminado")) {
            System.out.println("Ingrese un comando (iniciar, terminar): ");
            String comando = scanner.nextLine();
            switch (comando) {
                case "iniciar":
                    juego.iniciarJuego();
                    break;
                case "terminar":
                    juego.terminarJuego();
                    break;
                default:
                    System.out.println("Comando no reconocido.");
                    break;
            }
        }
        scanner.close();
    }
}
