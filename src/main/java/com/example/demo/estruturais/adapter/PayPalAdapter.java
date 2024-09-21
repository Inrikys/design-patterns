package com.example.demo.estruturais.adapter;

import com.example.demo.estruturais.adapter.libexternapaypal.LibExternaDadosPayPal;
import com.example.demo.estruturais.adapter.libexternapaypal.LibExternaPagamentoPayPal;

public class PayPalAdapter implements PagamentoProcessor {

    private final LibExternaPagamentoPayPal libExternaPagamentoPayPal;

    public PayPalAdapter(LibExternaPagamentoPayPal libExternaPagamentoPayPal) {
        this.libExternaPagamentoPayPal = libExternaPagamentoPayPal;
    }

    @Override
    public void efetuarPagamento(DadosEfetuarPagamento efetuarPagamento) {
        LibExternaDadosPayPal dadosPayPal = new LibExternaDadosPayPal(efetuarPagamento.getDadosEfetuarPagamento());
        libExternaPagamentoPayPal.pagarPayPal(dadosPayPal);
    }
}
