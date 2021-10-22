package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class Pedido {
    private String cliente;
    private Orcamento orcamento;
    private LocalDateTime dataPedido;

    public Pedido(String cliente, Orcamento orcamento, LocalDateTime dataPedido) {
        this.cliente = cliente;
        this.orcamento = orcamento;
        this.dataPedido = dataPedido;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }
}
