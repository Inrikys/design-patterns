package com.example.demo.comportamentais.chainofresponsibility;

public class GerenteSuporte extends SuporteHandler{

    @Override
    public void tratarProblema(String tipoProblema) {
        System.out.println(tipoProblema);
        System.out.println("Problema sendo tratado pelo Gerente....");
    }
}
