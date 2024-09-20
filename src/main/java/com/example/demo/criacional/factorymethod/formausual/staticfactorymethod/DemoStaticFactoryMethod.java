package com.example.demo.criacional.factorymethod.formausual.staticfactorymethod;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

public class DemoStaticFactoryMethod {

    public static void main(String[] args) {
        // Do próprio Java
        Integer num = Integer.valueOf(10);
        List<String> frutas = List.of("Maçã", "Banana", "Laranja");
        Optional<String> nome = Optional.of("João");
        Optional<String> vazio = Optional.empty();
        Calendar calendario = Calendar.getInstance();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Produto camera = new Produto("Camera", new BigDecimal("100.00"));
        Produto novoObjCamera = Produto.getNewInstance(camera);
    }
}
