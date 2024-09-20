package com.example.demo.comportamentais.strategy.exemplomeiolocomocao;

import java.time.Duration;

public interface MeioLocomocao {

    Integer getVelocidadeMediaKmPorHora();

    Duration tempoDeLocomocao(Integer distanciaEmKm);

}
