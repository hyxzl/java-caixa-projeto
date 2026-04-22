package estoque;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Produto>produtos = new ArrayList<>();

    public void adicionarProduto (Produto produto){
        produtos.add(produto);
    }

    public Produto buscarProduto (String nome){
        for (Produto p : produtos) {
            System.out.println("Tem no estoque: "+ p.getQuantidade());
            if(p.getNome().equalsIgnoreCase(nome)){
                return p;
            }
        }
        return null;
    }
    public void listarProdutos(){
        for (Produto p : produtos) {
            System.out.println(p.getNome()+ " | Preço: "+p.getPreço()+ " | Qtd: "+p.getQuantidade());
        }
    }
}
