package com.example.demo.comportamentais.strategy.strategyusandobean;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Pedido {

    @JsonProperty("valor")
    private BigDecimal valor;

    @JsonProperty("tipo_pagamento")
    private String tipoPagamento;

    public BigDecimal getValor() {
        return valor;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }
}
