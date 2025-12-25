package POO.untitled.poo.primeraclase.src.Desafio.Dominio;

public class JuegoRPG extends AbstractJuevo{
    //private Jugador jugador;

    public JuegoRPG(Jugador jugador) {
        super(jugador);
    }
    @Override
    public void evaluar() {
        int total = super.getJugador().calcularToltal();
        Mision mejor = super.getJugador().misionConMayorPuntaje();

        String mensajeChad = (total > 300) ? "Felicidades, Sos un verdadero Chad del RPG" : "Te falta entrenamiento";
        System.out.println(mensajeChad);

        System.out.println("Puntos acumulados: " + total);
        System.out.println("La mision que mejor rendimiento tuvo es en la mision numero: " + mejor.getNumero() + " con " + mejor.getPuntaje() + " puntos.");

        if (super.getJugador().tieneMisionFallida()) {
            System.out.println("Fallaste al menos una mision. Que el backend tenga piedad...");
        }

        if (super.getJugador().esConstante()) {
            System.out.println("Ejecucion constante! Sos el sueño de un arquitecto de software.");
        }
    }
}

