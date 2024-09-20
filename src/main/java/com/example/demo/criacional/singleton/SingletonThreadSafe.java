package com.example.demo.criacional.singleton;

public class SingletonThreadSafe {

    // A variável volatile garante que as mudanças feitas na variável vão ser visíveis
    // para todas as threads
    // private para ser modificada apenas por dentro da classe
    // static para gerar uma única instância para essa classe
    private static volatile SingletonThreadSafe instance;

    public String value;

    private SingletonThreadSafe(String value) {
        this.value = value;
    }

    public static SingletonThreadSafe getInstance(String value) {
        // Reduz acesso a variável volatile, pois exige mais processamento
        SingletonThreadSafe result = instance;
        if (result != null) {
            return result;
        }

        // Garante que apenas uma thread está executando a lógica dentro desse bloco
        // previnindo criação de instâncias multiplas
        synchronized(SingletonThreadSafe.class) {
            if (instance == null) {
                instance = new SingletonThreadSafe(value);
            }
            return instance;
        }
    }

}
