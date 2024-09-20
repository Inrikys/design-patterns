package com.example.demo.comportamentais.strategy.exemplomeiolocomocao;

import java.time.Duration;

public class CalcularTempoEstimadoOrigemDestino {

    public Duration executar(String coordOrigem, String coordDestino, MeioLocomocao meioLocomocao) {
        Integer distanciaKm = getDistanciaKm(coordOrigem, coordDestino);
        return meioLocomocao.tempoDeLocomocao(distanciaKm);
    }

    private Integer getDistanciaKm(String coordOrigem, String coordDestino) {
        System.out.println("alguma lógica para calcular distância");
        System.out.println(coordOrigem);
        System.out.println(coordDestino);

        return 50;
    }
}
