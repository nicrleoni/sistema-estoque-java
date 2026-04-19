package Sistema;

public class Produto {
    private String nome; //Atributo privado: visível apenas nesta classe
    private double preco;
    private int quantidade;

    //Construtor: acionado quando criamos o objeto 'new'
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome; // 'this' acessa o atributo na instância atual
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters simples para acessar os dados privados
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    //Metodo para exibir informacoes basicas
    public void exibirInformacoes() {
        System.out.println("Produto: " + nome + " | Preço: R$" + preco + " | Estoque: " + quantidade);

    }
}


