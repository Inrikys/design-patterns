package com.example.demo.comportamentais.strategy.exemplopagamento;

public class DemoPagamento {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        PagamentoStrategy pagamentoStrategy = PagamentoFactory.criarPagamento("Pix");
        pagamentoStrategy.pagar(pedido);

    }

}
