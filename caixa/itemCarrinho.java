package caixa;

import estoque.Produto;

public class itemCarrinho {
    private Produto produto;
    private int quantidade;

    public itemCarrinho(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario(){
        return produto.getPreço();
    }

    public void adicionarQuantidade(int qtd){
        this.quantidade += qtd;
    }

    public String getNomeProduto() {
        return produto.getNome();
    }
    public double getTotal(){
        return produto.getPreço() * quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }
}
