package com.example.demo.comportamentais.chainofresponsibility;

public abstract class SuporteHandler {

    protected SuporteHandler proximoHandler;

    public SuporteHandler() {
    }

    public SuporteHandler(SuporteHandler proximoHandler) {
        this.proximoHandler = proximoHandler;
    }

    public void setProximoHandler(SuporteHandler proximoHandler) {
        this.proximoHandler = proximoHandler;
    }

    public abstract void tratarProblema(String tipoProblema);
}
