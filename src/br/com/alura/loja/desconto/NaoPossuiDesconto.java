package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class NaoPossuiDesconto extends Desconto{
    public NaoPossuiDesconto() {
        super(null);
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return true;
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
