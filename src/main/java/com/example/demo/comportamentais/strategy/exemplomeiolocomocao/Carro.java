package com.example.demo.comportamentais.strategy.exemplomeiolocomocao;

import java.time.Duration;

public class Carro implements MeioLocomocao{

    @Override
    public Integer getVelocidadeMediaKmPorHora() {
        return 50;
    }

    @Override
    public Duration tempoDeLocomocao(Integer distanciaEmKm) {
        return DistanciaUtil.calcularTempoPorKm(distanciaEmKm, getVelocidadeMediaKmPorHora());
    }

}
