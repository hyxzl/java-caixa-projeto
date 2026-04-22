package estoque;

public class ProdutoEletronico extends Produto{
    private String garantiaMeses;

    @Override
    public boolean reduzirEstoque(int qtd) {
        return super.reduzirEstoque(qtd);
    }

    public ProdutoEletronico(String nome, double preço, int quantidade, String garantiaMeses) {
        super(nome, preço, quantidade);
        this.garantiaMeses = garantiaMeses;
    }
}
