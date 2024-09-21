package com.example.demo.comportamentais.strategy.strategyusandobean;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("strategy/pagamentos")
public class EfetuarCompraController {

    private final EfetuarCompraService efetuarCompraService;

    public EfetuarCompraController(EfetuarCompraService efetuarCompraService, PagamentoFactory pagamentoFactory) {
        this.efetuarCompraService = efetuarCompraService;
    }

    @PostMapping
    public ResponseEntity<String> efetuarCompra(@RequestBody Pedido pedido) {
        efetuarCompraService.executar(pedido);
        return ResponseEntity.accepted().body("Pagamento está sendo processado...");
    }

}
