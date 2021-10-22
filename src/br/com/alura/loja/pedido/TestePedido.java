package br.com.alura.loja.pedido;

import br.com.alura.loja.pedido.acoes.EnviaEmailPedido;
import br.com.alura.loja.pedido.acoes.SalvaPedido;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestePedido {
    public static void main(String[] args) {
        GeraPedido geraPedido = new GeraPedido("Maria da Silva",new BigDecimal("600.00"),4);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvaPedido(),new EnviaEmailPedido())
        );
        handler.executa(geraPedido);
    }
}
