package br.com.alura.loja.orcamento;

import br.com.alura.loja.http.HttpAdapter;
import br.com.alura.loja.orcamento.situacao.DomainException;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter adapter;

    public RegistroDeOrcamento(HttpAdapter adapter) {
        this.adapter = adapter;
    }

    public void registrar(Orcamento orcamento){

        if(!orcamento.isFinalizado()){
            throw new DomainException("orçamento não finalizado");
        }

        String url = "http://gihub.com/api";
        Map<String,Object> dados = Map.of(
                "valores",orcamento.getValor(),
                "quantidade de itens",orcamento.getItens()
        );
        adapter.post(url,dados);
    }
}
