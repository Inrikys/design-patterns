package com.example.demo.comportamentais.strategy.exemplomeiolocomocao;

import java.time.Duration;

public class DistanciaUtil {

    public static Duration calcularTempoPorKm(Integer distanciaEmKm, Integer velocidadeMeiaKmPorHora){

        if (distanciaEmKm <= 0) {
            return Duration.ofHours(0);
        }

        int distancia = distanciaEmKm / velocidadeMeiaKmPorHora;
        return Duration.ofHours(distancia);
    }

}
