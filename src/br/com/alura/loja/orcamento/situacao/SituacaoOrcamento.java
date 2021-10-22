package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.situacao.DomainException;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }
    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orcamento não pôde ser aprovado");
    }
    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orcamento não pôde ser reprovado");
    }
    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orcamento não pôde ser finalizado");
    }
}
