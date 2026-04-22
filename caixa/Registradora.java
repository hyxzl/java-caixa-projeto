package caixa;
import estoque.Produto;

import java.util.ArrayList;
import java.util.List;

public class Registradora {
    private List<itemCarrinho> itens = new ArrayList<>();

    public void listarItens(){
        System.out.println("\n====== Carrinho ======");
        if (itens.isEmpty()){
            System.out.println("Carrinho Vazio!");
            return;
        }
        for (itemCarrinho item : itens) {
            System.out.println(
                    item.getNomeProduto() +
                            "| Qtd: " + item.getQuantidade() +
                            "| UND: " + item.getPrecoUnitario() +
                            "| Total: " + item.getTotal()
            );
        }
        System.out.println("====================");
        System.out.println("Total: " + calcularTotal());
    }
    public void limparCarrinho(){
        itens.clear();
    }

    public void finalizarCompra(){
        if (itens.isEmpty()){
            System.out.println("CARRINHO VAZIO!");
            return;
        }
        listarItens();
        System.out.println("\nCompra finalizada com sucesso!");
        limparCarrinho();
    }

    public void adicionarItem (itemCarrinho novoItem){
        for (itemCarrinho item : itens) {
            if (item.getNomeProduto().equalsIgnoreCase(novoItem.getNomeProduto())){
                item.adicionarQuantidade(novoItem.getQuantidade());
                return;
            }
        }
        itens.add(novoItem);
    }

    public double calcularTotal(){
        double total = 0;
        for (itemCarrinho item : itens) {
            total += item.getTotal();
        }
        return total;
    }
}
