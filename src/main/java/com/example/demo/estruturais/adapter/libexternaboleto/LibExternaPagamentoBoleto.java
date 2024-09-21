package com.example.demo.estruturais.adapter.libexternaboleto;

import org.springframework.stereotype.Component;

@Component
public class LibExternaPagamentoBoleto {

    public void pagarBoleto(LibExternaDadosBoleto dadosBoleto) {
        System.out.println("Pagamento por boleto...");
        System.out.println(dadosBoleto.getDadosBoleto());
    }

}
