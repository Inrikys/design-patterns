package com.example.demo.estruturais.adapter;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DadosEfetuarPagamento {

    @JsonProperty("dados_efetuar_pagamento")
    private String dadosEfetuarPagamento;

    public String getDadosEfetuarPagamento() {
        return dadosEfetuarPagamento;
    }
}
