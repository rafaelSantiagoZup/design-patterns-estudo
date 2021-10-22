package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaMaisDeQuatroItens extends Desconto{
    public DescontoParaMaisDeQuatroItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getItens() > 4;
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.03"));
    }
}
