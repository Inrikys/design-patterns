package com.example.demo.comportamentais.strategy.exemplomeiolocomocao;

import java.time.Duration;

public class DemoStrategy {


    public static void main(String[] args) {

        String coordOrigem = "41.40338";
        String coordDestino = "2.17403";

        MeioLocomocao carro = new Carro();
        MeioLocomocao onibus = new Onibus();
        MeioLocomocao pedestre = new Pedestre();

        CalcularTempoEstimadoOrigemDestino calcularTempoEstimadoOrigemDestino = new CalcularTempoEstimadoOrigemDestino();

        Duration duracaoCarro = calcularTempoEstimadoOrigemDestino.executar(coordOrigem, coordDestino, carro);
        System.out.println(duracaoCarro);

        Duration duracaoOnibus = calcularTempoEstimadoOrigemDestino.executar(coordOrigem, coordDestino, onibus);
        System.out.println(duracaoOnibus);

        Duration duracaoPedestre = calcularTempoEstimadoOrigemDestino.executar(coordOrigem, coordDestino, pedestre);
        System.out.println(duracaoPedestre);

    }

}
