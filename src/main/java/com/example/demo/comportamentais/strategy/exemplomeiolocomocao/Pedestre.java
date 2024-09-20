package com.example.demo.comportamentais.strategy.exemplomeiolocomocao;

import java.time.Duration;

public class Pedestre implements MeioLocomocao {

    @Override
    public Integer getVelocidadeMediaKmPorHora() {
        return 5;
    }

    @Override
    public Duration tempoDeLocomocao(Integer distanciaEmKm) {
        return DistanciaUtil.calcularTempoPorKm(distanciaEmKm, getVelocidadeMediaKmPorHora());
    }

}
