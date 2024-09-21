package com.example.demo.comportamentais.strategy.strategyusandobean;

import org.springframework.stereotype.Service;

@Service
public class EfetuarCompraService {

    private final PagamentoFactory pagamentoFactory;

    public EfetuarCompraService(PagamentoFactory pagamentoFactory) {
        this.pagamentoFactory = pagamentoFactory;
    }

    void executar(Pedido pedido) {
        PagamentoStrategy pagamentoStrategy = pagamentoFactory.criarBeanPagamento(pedido.getTipoPagamento());
        pagamentoStrategy.pagar(pedido);
    }

}
