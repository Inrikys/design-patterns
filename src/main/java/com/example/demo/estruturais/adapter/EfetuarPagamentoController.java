package com.example.demo.estruturais.adapter;


import com.example.demo.estruturais.adapter.libexternaboleto.LibExternaPagamentoBoleto;
import com.example.demo.estruturais.adapter.libexternapaypal.LibExternaPagamentoPayPal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adapter/pagamentos")
public class EfetuarPagamentoController {

    private final LibExternaPagamentoPayPal pagamentoPayPal;

    private final LibExternaPagamentoBoleto pagamentoBoleto;

    public EfetuarPagamentoController(LibExternaPagamentoPayPal pagamentoPayPal, LibExternaPagamentoBoleto pagamentoBoleto) {
        this.pagamentoPayPal = pagamentoPayPal;
        this.pagamentoBoleto = pagamentoBoleto;
    }


    @PostMapping
    public ResponseEntity<String> efetuarPagamento(@RequestBody DadosEfetuarPagamento dados) {

        EfetuarPagamentoService efetuarPagamentoService;

        // Adapta a lib externa para o tipo de objeto desejado pelo meu service que realiza o pagamento
        if ("paypal".equalsIgnoreCase(dados.getDadosEfetuarPagamento())) {
            PagamentoProcessor pagamentoProcessorPayPal = new PayPalAdapter(pagamentoPayPal);
            efetuarPagamentoService = new EfetuarPagamentoService(pagamentoProcessorPayPal);
        } else {
            PagamentoProcessor pagamentoProcessorBoleto = new BoletoAdapter(pagamentoBoleto);
            efetuarPagamentoService = new EfetuarPagamentoService(pagamentoProcessorBoleto);
        }

        efetuarPagamentoService.executar(dados);

        return ResponseEntity.accepted().body("Processando pagamento...");
    }

}
