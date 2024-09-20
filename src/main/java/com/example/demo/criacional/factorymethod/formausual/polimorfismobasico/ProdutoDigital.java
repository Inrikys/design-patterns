package com.example.demo.criacional.factorymethod.formausual.polimorfismobasico;

import java.math.BigDecimal;

public class ProdutoDigital extends Produto {

    public ProdutoDigital(String nome, BigDecimal preco) {
        super(nome, preco);
    }

    public ProdutoDigital() {
    }

    @Override
    public String getNome() {
        return this.nome + "[digital]";
    }
}
