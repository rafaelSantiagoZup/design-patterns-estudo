package br.com.alura.loja.orcamento.situacao;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}
