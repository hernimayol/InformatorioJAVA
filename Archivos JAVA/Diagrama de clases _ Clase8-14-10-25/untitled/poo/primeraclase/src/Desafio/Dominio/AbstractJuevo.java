package POO.untitled.poo.primeraclase.src.Desafio.Dominio;

public abstract class AbstractJuevo {
    private Jugador jugador;

    public AbstractJuevo(Jugador jugador){
        this.jugador = jugador;
    }

    public abstract void evaluar();

    public Jugador getJugador() {
        return jugador;
    }
}
