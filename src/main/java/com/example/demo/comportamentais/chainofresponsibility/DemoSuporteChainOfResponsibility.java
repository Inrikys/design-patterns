package com.example.demo.comportamentais.chainofresponsibility;

public class DemoSuporteChainOfResponsibility {

    public static void main(String[] args) {

        // Criando handlers e definindo cadeia de responsabilidades através do construtor
        // passando o próximo handler
        SuporteHandler gerenteHandler = new GerenteSuporte();

        // Setando gerente como próximo handler
        SuporteHandler supervisorHandler = new SupervisorSuporte(gerenteHandler);

        // Supervisor como próximo handler
        SuporteHandler atendenteHandler = new AtendenteSuporte(supervisorHandler);

        atendenteHandler.tratarProblema("low");
        atendenteHandler.tratarProblema("medium");
        atendenteHandler.tratarProblema("high");
    }

}
