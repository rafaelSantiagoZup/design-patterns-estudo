package br.com.alura.loja.pedido.acoes;

import br.com.alura.loja.pedido.Pedido;

public class EnviaEmailPedido implements AcaoAposGerarPedido {
    public void executarAcao(Pedido pedido){
        System.out.println("Enviando email");
    }
}
