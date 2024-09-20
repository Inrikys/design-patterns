package com.example.demo.comportamentais.strategy.exemplopagamento;

public class PagamentoDebito implements PagamentoStrategy{
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento Debito...");
    }
}
