package Sistema;

import java.util.ArrayList; // Importacao necessaria para listas dinamicas
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Inicializaçao do Scanner e da lista Dinamica
        Scanner leitura = new Scanner(System.in);
        List<Produto> inventario = new ArrayList<>();
        boolean continuar = true;

        System.out.println("--- Bem-vindo ao Sistema de Estoque Profissional ---");

        // Criando o Loop de interacao com usuario
        while (continuar) {
            try {
           // Exibicao do Menu Interativo
                System.out.println("\nSelecione uma opção:");
                System.out.println("1- Adicionar Produto");
                System.out.println("2- Listar Estoque");
                System.out.println("3- Remover Produto");
                System.out.println("4- Sair");

                int opcao = leitura.nextInt();
                leitura.nextLine(); // Limpeza do buffer apos ler um numero

            if (opcao == 1) {
                // Captura de dados reais para o construtor
                System.out.println("Nome do produto:");
                String nome = leitura.nextLine();

                System.out.println("Preço do produto: ");
                double preco = leitura.nextDouble();

                System.out.println("Quantidade em estoque: ");
                int quantidade = leitura.nextInt();
                leitura.nextLine();

                // Adicionando o novo objeto a lista
                inventario.add(new Produto(nome, preco, quantidade));
                System.out.println("Produto adiconado com sucesso!");

            } else if (opcao == 2) {
               // Listagem usando o loop for-each
                System.out.println("\n--- Relatório de Estoque ---");
                if (inventario.isEmpty()) {
                    System.out.println("O estoque está vazio.");
                } else {
                    for (int i = 0; i < inventario.size(); i++) {
                        // Exibimos o índice para facilitar a remocao posterior
                        System.out.println("[" + i + "]");
                        inventario.get(i).exibirInformacoes();
                    }
                }

            } else if (opcao == 3) {
                // Funcionalidade de remocao dinamica
                System.out.println("Digite o índice do produto que deseja remover: ");
                int indice = leitura.nextInt();
                leitura.nextLine(); // Limpeza do buffer

                try {
                    // O ArrayList reorganiza os índices automaticamente após a remoçao
                    Produto removido = inventario.remove(indice);
                    System.out.println("Produto '" + removido.getNome() + "' removido com sucesso!");
                } catch (IndexOutOfBoundsException e) {
                    // Trata o erro caso o usuário digite um indice que nao existe na lista
                    System.out.println("Erro: Posição inválida no inventário.");

                }
            }
            else if (opcao == 4) { //Percorre a lista
                System.out.println("Encerrando o sistema...");
                continuar = false;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

    } catch (Exception e) {
                // Captura erros de digitacao (ex: letras em capos de numeros)
                System.out.println("Erro: Entrada inválida. Por favor, use apenas números para opções e valores.");
                leitura.nextLine(); // Limpa o rastro do erro para nao travar o loop
            }
        }
        leitura.close(); // Fecha o Scanner ao finalizar
    }
}

