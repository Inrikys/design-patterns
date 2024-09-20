package com.example.demo.comportamentais.strategy.exemplopagamento;

public class EfetuarCompraService {

    // Pode ser qualquer tipo de classe concreta que implementa essa abstração
    private final PagamentoStrategy pagamentoStrategy;

    public EfetuarCompraService(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    void executar(Pedido pedido) {
        pagamentoStrategy.pagar(pedido);
    }

}
