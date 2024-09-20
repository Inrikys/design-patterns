package com.example.demo.comportamentais.strategy.exemplopagamento;

import com.example.demo.criacional.factorymethod.formausual.polimorfismobasico.ProdutoDigital;
import com.example.demo.criacional.factorymethod.formausual.polimorfismobasico.ProdutoFisico;

public class PagamentoFactory {

    public static PagamentoStrategy criarPagamento(String tipoPagamento) {
        return switch (tipoPagamento.toLowerCase()) {
            case "pix" -> new PagamentoPix();
            case "debito" -> new PagamentoDebito();
            default -> new PagamentoCredito();
        };

    }

}
