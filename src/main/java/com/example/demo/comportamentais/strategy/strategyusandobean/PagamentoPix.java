package com.example.demo.comportamentais.strategy.strategyusandobean;

import org.springframework.stereotype.Component;

@Component("pagamentoPix")
public class PagamentoPix implements PagamentoStrategy {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento Pix...");
    }
}
