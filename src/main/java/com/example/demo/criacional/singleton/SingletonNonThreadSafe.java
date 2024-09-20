package com.example.demo.criacional.singleton;

public class SingletonNonThreadSafe {

    private static SingletonNonThreadSafe instance;
    public String value;

    // Construtor privado para proibir a instanciação via construtor
    private SingletonNonThreadSafe(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    // Não seguro para ser usado em mais de uma thread
    public static SingletonNonThreadSafe getInstance(String value) {
        if (instance == null) {
            instance = new SingletonNonThreadSafe(value);
        }
        return instance;
    }

}
