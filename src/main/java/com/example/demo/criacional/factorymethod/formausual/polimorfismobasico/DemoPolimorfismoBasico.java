package com.example.demo.criacional.factorymethod.formausual.polimorfismobasico;

import java.math.BigDecimal;

public class DemoPolimorfismoBasico {


    public static void main(String[] args) {
        // o static factory tem a inteligência para criar um produto
        // do tipo físico ou digital
        Produto produto = Produto.getInstance("digital");

        produto.setNome("Camera");
        produto.setPreco(new BigDecimal("1000.00"));

        System.out.println(produto.getNome());
    }

}
