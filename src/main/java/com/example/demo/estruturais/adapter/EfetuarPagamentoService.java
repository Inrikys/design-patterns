package com.example.demo.estruturais.adapter;

public class EfetuarPagamentoService {

    private final PagamentoProcessor pagamentoProcessor;

    public EfetuarPagamentoService(PagamentoProcessor pagamentoProcessor) {
        this.pagamentoProcessor = pagamentoProcessor;
    }

    public void executar(DadosEfetuarPagamento dadosEfetuarPagamento) {
        pagamentoProcessor.efetuarPagamento(dadosEfetuarPagamento);
    }
}
