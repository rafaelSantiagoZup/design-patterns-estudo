package br.com.alura.loja.pedido.acoes;

import br.com.alura.loja.pedido.Pedido;

public class SalvaPedido implements AcaoAposGerarPedido {
    public void executarAcao(Pedido pedido){
        System.out.println("Salva pedido");
    }
}
