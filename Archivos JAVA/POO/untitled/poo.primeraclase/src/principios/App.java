package principios;

import principios.herencia.Celular;
import principios.herencia.Paloma;
import principios.herencia.Telegrafo;

public class App {
    public static void main(String[] args) {
        Celular celular = new Celular("Mama", false);
        Telegrafo telegrafo = new Telegrafo("Mi abuelo");
        Paloma paloma = new Paloma("Mi hermana");


        celular.enviarMensaje(" Hola Mama");
        telegrafo.enviarMensaje("Hola abu");
        paloma.enviarMensaje("Junta la ropa");

    }
}
