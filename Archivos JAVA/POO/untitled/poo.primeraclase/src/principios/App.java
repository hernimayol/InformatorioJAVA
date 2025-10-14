package principios;

import principios.abstraccion.Animal;
import principios.abstraccion.Gato;
import principios.abstraccion.IComportamientoPerro;
import principios.abstraccion.Perro;
import principios.herencia.Celular;
import principios.herencia.Paloma;
import principios.herencia.Telegrafo;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
       //Herencia
        Celular celular = new Celular("Mama", false);
        Telegrafo telegrafo = new Telegrafo("Mi abuelo");
        Paloma paloma = new Paloma("Mi hermana");


        celular.enviarMensaje(" Hola Mama");
        telegrafo.enviarMensaje("Hola abu");
        paloma.enviarMensaje("Junta la ropa");


        //Abstraccion

        Gato gato = new Gato("Tesla", 4,true);
        Perro perro = new Perro("Adolf", 4, true);


        gato.emitirSonido();
        perro.emitirSonido();

        perro.moverLaCola();


        List<Animal> animals = new ArrayList<>();
        animals.add(gato);
        animals.add(perro);

        for (int i = 0; i < animals.size(); i++){
            animals.get(i).emitirSonido();
        }

        IComportamientoPerro interfazImplementada = new Perro("nombre", 4, true);
        interfazImplementada.moverLaCola();
        interfazImplementada.traerPalito();

    }
}
