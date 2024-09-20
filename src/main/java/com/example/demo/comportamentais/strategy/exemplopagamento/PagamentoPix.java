package com.example.demo.comportamentais.strategy.exemplopagamento;

public class PagamentoPix implements PagamentoStrategy {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento Pix...");
    }
}
