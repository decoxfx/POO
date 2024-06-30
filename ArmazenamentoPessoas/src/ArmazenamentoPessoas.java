
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArmazenamentoPessoas {
    private static Map<String, Pessoa> pessoas = new HashMap<>(); // Criação do hashmap para armazenar pessoas, usando o nome como chave

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarPessoa(scanner);
                    break;
                case 2:
                    consultarPessoa(scanner);
                    break;
                case 0:
                    System.out.println("O programa será encerrado...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() { // menu principal do programa, com 3 opções
        System.out.println("\n=== Menu ===");
        System.out.println("1. Adicionar pessoa");
        System.out.println("2. Consultar pessoa");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarPessoa(Scanner scanner) {
        System.out.println("\n== Adicionar Pessoa ==");

        System.out.print("Digite o nome: ");
        String nome = scanner.next();

        System.out.print("Digite o telefone de emergência: ");
        String telefoneEmergencia = scanner.next();

        System.out.print("Digite o tipo sanguíneo: ");
        String tipoSanguineo = scanner.next();

        System.out.print("Digite o email: ");
        String email = scanner.next();

        System.out.print("Digite as alergias: ");
        String alergias = scanner.next();

        System.out.print("Digite os problemas de saúde crônicos: ");
        String problemasSaude = scanner.next();

        // Criação do objeto pessoa, com os parâmetros fornecidos no cadastramento
        Pessoa pessoa = new Pessoa(nome, telefoneEmergencia, tipoSanguineo, email, alergias, problemasSaude);

        // Adicionar ao hashmap
        pessoas.put(nome, pessoa);

        System.out.println("Pessoa adicionada com sucesso!"); // retorna mensagem de sucesso
    }

    private static void consultarPessoa(Scanner scanner) {
        System.out.println("\n== Consultar Pessoa ==");

        System.out.print("Digite o nome da pessoa que deseja consultar: "); // pesquisa a pessoa com base no nome
        String nome = scanner.next();

        // busca pelo parâmetro fornecido no hashmap
        Pessoa pessoa = pessoas.get(nome);

        if (pessoa != null) {
            System.out.println("Informações encontradas:\n" + pessoa); // mensagem de sucesso
        } else {
            System.out.println("Pessoa não encontrada."); // mensagem de erro
        }
    }
}
