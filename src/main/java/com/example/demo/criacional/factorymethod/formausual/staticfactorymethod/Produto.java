package com.example.demo.criacional.factorymethod.formausual.staticfactorymethod;

import java.math.BigDecimal;

public class Produto {

    private String nome;
    private BigDecimal preco;

    public Produto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Produto getNewInstance(Produto produto) {
        return new Produto(produto.getNome(), produto.preco);
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Produto setPreco(BigDecimal preco) {
        this.preco = preco;
        return this;
    }
}
