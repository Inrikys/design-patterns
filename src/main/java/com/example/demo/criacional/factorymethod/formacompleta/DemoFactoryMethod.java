package com.example.demo.criacional.factorymethod.formacompleta;

public class DemoFactoryMethod {

    public static void main(String[] args) {
        // Suponha que você tem uma lógica para decidir o tipo de entrega
        String deliveryType = "CAMINHAO"; // Pode ser "CAMINHAO" ou "NAVIO"

        EntregaFactory entregaFactory;

        if (deliveryType.equalsIgnoreCase("CAMINHAO")) {
            entregaFactory = new CaminhaoEntregaFactory();
        } else if (deliveryType.equalsIgnoreCase("NAVIO")) {
            entregaFactory = new NavioEntregaFactory();
        } else {
            throw new IllegalArgumentException("Tipo de entrega desconhecido: " + deliveryType);
        }

        // Realiza a entrega usando o criador apropriado
        Transporte transporte = entregaFactory.fabricarTransporte();
        transporte.fazerEntrega();
    }


}
