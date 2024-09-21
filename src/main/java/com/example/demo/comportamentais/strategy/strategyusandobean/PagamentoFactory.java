package com.example.demo.comportamentais.strategy.strategyusandobean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class PagamentoFactory {

    private final ConfigurableApplicationContext context;

    public PagamentoFactory(ConfigurableApplicationContext context) {
        this.context = context;
    }

    public PagamentoStrategy criarBeanPagamento(String tipoPagamento) {

        PagamentoStrategy bean = null;
        Class<?> beanClass = null;

        switch (tipoPagamento.toLowerCase()) {
            case "pix" -> {
                bean = context.getBeanFactory().createBean(PagamentoPix.class);
                beanClass = PagamentoPix.class;
            }
            case "debito" -> {
                bean = context.getBeanFactory().createBean(PagamentoDebito.class);
                beanClass = PagamentoDebito.class;
            }
            default -> {
                bean = context.getBeanFactory().createBean(PagamentoCredito.class);
                beanClass = PagamentoCredito.class;
            }
        }

        context.getBeanFactory().registerSingleton(beanClass.getName(), bean);
        return bean;
    }

}
