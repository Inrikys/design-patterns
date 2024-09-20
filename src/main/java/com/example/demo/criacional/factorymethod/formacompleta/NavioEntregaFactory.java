package com.example.demo.criacional.factorymethod.formacompleta;

public class NavioEntregaFactory extends EntregaFactory {

    @Override
    public Transporte fabricarTransporte() {
        return new Navio();
    }
}
