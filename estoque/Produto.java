package estoque;

    public class Produto{
        protected String nome;
        protected double preço;
        protected int quantidade;

        public Produto (String nome, double preço, int quantidade){
            this.nome = nome;
            this.preço = preço;
            this.quantidade = quantidade;
        }

        public String getNome() {
            return nome;
        }

        public double getPreço() {
            return preço;
        }

        public int getQuantidade() {
            return quantidade;
        }
        public boolean reduzirEstoque (int qtd){
            if(qtd <= 0){
                System.out.println("Quantidade inválida!");
                return false;
            }
            if(qtd > this.quantidade){
                System.out.println("Estoque insuficiente!");
                return false;
            }
            this.quantidade -= qtd;
            return true;
        }

        public void add(Produto produto) {

        }
    }
