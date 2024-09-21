package com.example.demo.estruturais.adapter.libexternapaypal;

import org.springframework.stereotype.Component;

@Component
public class LibExternaPagamentoPayPal {

    public void pagarPayPal(LibExternaDadosPayPal dadosPaypal) {
        System.out.println("Pagamento por PayPal...");
        System.out.println(dadosPaypal.getDadosPaypal());
    }

}
