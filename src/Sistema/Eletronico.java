package Sistema;

// Eletronico herda de Produto e assina o contrato Promocional
public class Eletronico extends Produto implements Promocional {
    private int mesesGarantia;

    // Construtor
    public Eletronico(String nome, double preco, int quantidade, int garantia) {
        super(nome, preco, quantidade); // Chama o construtor da classe Produto
        this.mesesGarantia = garantia;
    }

    @Override
    public void aplicarDesconto(double porcentagem) {
        // Estes métodos getPreco e setPreco PRECISAM existir na classe Produto
        double novoPreco = getPreco() - (getPreco() * (porcentagem / 100));
        setPreco(novoPreco);
        System.out.println("Desconto aplicado no eletrônico " + getNome() + ". Novo preço: R$" + novoPreco);
    }
} // ESTA chave fecha a classe e deve ser a última linha do arquivo