package com.example.demo.comportamentais.strategy.strategyusandobean;

import org.springframework.stereotype.Component;

@Component("pagamendoDebito")
public class PagamentoDebito implements PagamentoStrategy {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento Debito...");
    }
}
