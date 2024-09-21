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

        Class<? extends PagamentoStrategy> beanClass = getPagamentoClass(tipoPagamento);
        return getOrCreateBean(beanClass);
    }

    private Class<? extends PagamentoStrategy> getPagamentoClass(String tipoPagamento) {
        return switch (tipoPagamento.toLowerCase()) {
            case "pix" -> PagamentoPix.class;
            case "debito" -> PagamentoDebito.class;
            default -> PagamentoCredito.class;
        };
    }

    private PagamentoStrategy getOrCreateBean(Class<? extends PagamentoStrategy> beanClass) {
        String beanName = beanClass.getName();

        if (context.getBeanFactory().containsSingleton(beanName)) {
            return (PagamentoStrategy) context.getBean(beanName);
        }

        PagamentoStrategy bean = context.getBeanFactory().createBean(beanClass);
        context.getBeanFactory().registerSingleton(beanName, bean);
        return bean;
    }

}
