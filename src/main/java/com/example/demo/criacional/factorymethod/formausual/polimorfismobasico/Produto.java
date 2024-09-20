package com.example.demo.criacional.factorymethod.formausual.polimorfismobasico;

import java.math.BigDecimal;

public abstract class Produto {

    protected String nome;

    protected BigDecimal preco;

    public Produto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {
    }
    
    public static Produto getInstance(String tipoProduto) {
        return switch (tipoProduto) {
            case "digital" -> new ProdutoDigital();
            default -> new ProdutoFisico();
        };
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
