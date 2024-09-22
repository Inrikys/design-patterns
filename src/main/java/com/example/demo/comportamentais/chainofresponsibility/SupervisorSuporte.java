package com.example.demo.comportamentais.chainofresponsibility;

public class SupervisorSuporte extends SuporteHandler {

    public SupervisorSuporte(SuporteHandler proximoNivel) {
        super(proximoNivel);
    }

    @Override
    public void tratarProblema(String tipoProblema) {
        if ("medium".equalsIgnoreCase(tipoProblema)) {
            System.out.println(tipoProblema);
            System.out.println("Problema sendo tratado pelo Supervisor....");
        } else if (this.proximoHandler != null) {
            this.proximoHandler.tratarProblema(tipoProblema);
        }

    }
}
