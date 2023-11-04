import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class collections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>(); //armazena os nomes

        System.out.println("Digite os nomes das pessoas (separados por vírgula):");
        String input = scanner.nextLine();

        String[] nomesArray = input.split(",");

        for (String nome : nomesArray) {
            nomes.add(nome.trim());
        }

        System.out.println("Deseja ordenar em ordem alfabética (A) ou em ordem decrescente (D)?"); //pergunta ao usuário se ele quer ordenar por ordem alfabética ou decrescente
        String opcao = scanner.nextLine();

        if (opcao.equalsIgnoreCase("A")) {
            Collections.sort(nomes);
            System.out.println("Nomes ordenados em ordem alfabética:");
        } else if (opcao.equalsIgnoreCase("D")) {
            Collections.sort(nomes, Collections.reverseOrder());
            System.out.println("Nomes ordenados em ordem decrescente:");
        } else {
            System.out.println("Opção inválida. Nomes não foram ordenados."); //não entende qual o comando além de (A) e (D)
        }

        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close(); //fecha o programa após ordenação 
    }
}

