package com.example.demo.criacional.factorymethod.formacompleta;

public class CaminhaoEntregaFactory extends EntregaFactory {
    @Override
    public Transporte fabricarTransporte() {
        return new Caminhao();
    }
}
