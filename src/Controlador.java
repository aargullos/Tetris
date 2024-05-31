public class Controlador {
    private Juego juego;

    public Controlador(Juego juego) {
        this.juego = juego;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }
}
