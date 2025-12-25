package POO.untitled.poo.primeraclase.src.Desafio.service.JuegoRPG.impl;

import POO.untitled.poo.primeraclase.src.Desafio.Dominio.Jugador;
import POO.untitled.poo.primeraclase.src.Desafio.service.JuegoRPG.JuegoRPGService;

public class JuegoRPGServideImpl implements JuegoRPGService {

    @Override
    public String evaluar(Jugador jugador){
        return "";
    }

    @Override
    public String mensajeDeConstancia(Jugador jugador){
        if(jugador.tieneMisionFallida()){
        };
    }

    @Override
    public String tieneFallos(Jugador jugador){
        if (jugador.esConstante()){
            return "Ejecucion constante! Sos el sueño de un arquitecto de software ";

        }

    }

}
