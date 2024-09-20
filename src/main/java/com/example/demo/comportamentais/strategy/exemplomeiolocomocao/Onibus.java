package com.example.demo.comportamentais.strategy.exemplomeiolocomocao;

import java.time.Duration;

public class Onibus implements MeioLocomocao{

    @Override
    public Integer getVelocidadeMediaKmPorHora() {
        return 40;
    }

    @Override
    public Duration tempoDeLocomocao(Integer distanciaEmKm) {
        return DistanciaUtil.calcularTempoPorKm(distanciaEmKm, getVelocidadeMediaKmPorHora());
    }

}
