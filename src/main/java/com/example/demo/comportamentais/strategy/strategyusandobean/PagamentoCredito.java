package com.example.demo.comportamentais.strategy.strategyusandobean;

import org.springframework.stereotype.Component;

@Component("pagamentoCredito")
public class PagamentoCredito implements PagamentoStrategy {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento Crédito..");
    }
}
