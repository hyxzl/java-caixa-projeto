package caixa;
import java.util.Scanner;
import estoque.Inventario;
import estoque.Produto;
import estoque.ProdutoAlimenticio;
import estoque.ProdutoEletronico;

public class Carrinho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        Registradora registradora = new Registradora();

        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE CAIXA ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos ");
            System.out.println("3 - Vender produtos");
            System.out.println("4 - Ver carrinho");
            System.out.println("5 - Finalizar compra");
            System.out.println("6 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.println("Preço: ");
                    double preco = Double.parseDouble(scanner.nextLine());

                    System.out.println("Quantidade: ");
                    int qtd = scanner.nextInt();
                    scanner.nextLine();

                    Produto produto = new Produto(nome, preco, qtd);
                    inventario.adicionarProduto(produto);
                    System.out.println("Produto cadastrado!");
                    break;
                case 2:
                    inventario.listarProdutos();
                    break;
                case 3:
                    System.out.println("Nome do produto: ");
                    String nomeBusca = scanner.nextLine();

                    Produto produtoBuscado = inventario.buscarProduto(nomeBusca);
                    if (produtoBuscado != null){
                        System.out.println("Quantidade: ");
                        int qtdVenda = scanner.nextInt();
                        scanner.nextLine();
                        if (produtoBuscado.reduzirEstoque(qtdVenda)){
                            itemCarrinho item = new itemCarrinho(produtoBuscado, qtdVenda);
                            registradora.adicionarItem(item);
                            System.out.println("Venda Realizada!");
                        } else {
                            System.out.println("Erro na venda");
                        }
                    }else {
                        System.out.println("Produto não encontrado");
                    }
                    break;
                case 4:
                    registradora.listarItens();
                    break;
                case 5:
                    registradora.finalizarCompra();
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (opcao != 6);
    }
}
