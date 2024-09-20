package com.example.demo.criacional.factorymethod.formausual.polimorfismobasico;

import java.math.BigDecimal;

public class ProdutoFisico extends Produto {

    public ProdutoFisico(String nome, BigDecimal preco) {
        super(nome, preco);
    }

    public ProdutoFisico() {
        super();
    }

    @Override
    public String getNome() {
        return this.nome + "[fisico]";
    }
}
