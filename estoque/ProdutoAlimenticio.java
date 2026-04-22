package estoque;

public class ProdutoAlimenticio extends Produto{
    private String dataValidade;

    @Override
    public boolean reduzirEstoque(int qtd) {
        return super.reduzirEstoque(qtd);
    }

    public ProdutoAlimenticio(String nome, double preço, int quantidade, String dataValidade) {
        super(nome, preço, quantidade);
        this.dataValidade = dataValidade;
    }
}
