package POO.untitled.poo.primeraclase.src.Desafio.Dominio;

import java.util.List;

public class Jugador {

    private List<Mision> misiones;

    public Jugador(List<Mision> misiones){
        this.misiones = misiones;
    }

    public List<Mision> getMisiones(){
        return misiones;
    }
}