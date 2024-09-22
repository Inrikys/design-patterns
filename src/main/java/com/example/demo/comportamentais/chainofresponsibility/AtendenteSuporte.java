package com.example.demo.comportamentais.chainofresponsibility;

public class AtendenteSuporte extends SuporteHandler {

    public AtendenteSuporte(SuporteHandler proximoNivel) {
        super(proximoNivel);
    }

    @Override
    public void tratarProblema(String tipoProblema) {

        if ("low".equalsIgnoreCase(tipoProblema)) {
            System.out.println(tipoProblema);
            System.out.println("Problema sendo tratado pelo Atendente....");
        } else if (this.proximoHandler != null) {
            this.proximoHandler.tratarProblema(tipoProblema);
        }

    }
}
