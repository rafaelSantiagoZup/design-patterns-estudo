package br.com.alura.loja.orcamento;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;

import java.math.BigDecimal;

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("600"),1);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("100"),10);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(orcamento1));
        System.out.println(calculadora.calcular(orcamento2));
    }
}
