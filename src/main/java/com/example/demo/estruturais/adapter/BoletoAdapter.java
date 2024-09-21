package com.example.demo.estruturais.adapter;

import com.example.demo.estruturais.adapter.libexternaboleto.LibExternaDadosBoleto;
import com.example.demo.estruturais.adapter.libexternaboleto.LibExternaPagamentoBoleto;

public class BoletoAdapter implements PagamentoProcessor {

    private final LibExternaPagamentoBoleto libExternaPagamentoBoleto;

    public BoletoAdapter(LibExternaPagamentoBoleto libExternaPagamentoBoleto) {
        this.libExternaPagamentoBoleto = libExternaPagamentoBoleto;
    }

    @Override
    public void efetuarPagamento(DadosEfetuarPagamento efetuarPagamento) {
        LibExternaDadosBoleto dadosBoleto = new LibExternaDadosBoleto(efetuarPagamento.getDadosEfetuarPagamento());
        libExternaPagamentoBoleto.pagarBoleto(dadosBoleto);
    }
}
