import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoGrupos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de nomes a inserir (entre 0 e 100): ");
        int numNomes = scanner.nextInt();
        scanner.nextLine(); 

        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();
        ArrayList<String> naoInformado = new ArrayList<>();

        for (int i = 0; i < numNomes; i++) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.nextLine().trim();

            System.out.print("Informe o gênero (M - Masculino, F - Feminino, N - Não informado): ");
            String genero = scanner.nextLine().trim().toUpperCase();

            if (genero.equals("M")) {
                masculino.add(nome);
            } else if (genero.equals("F")) {
                feminino.add(nome);
            } else {
                naoInformado.add(nome);
            }
        }

        scanner.close();

        Collections.sort(masculino);
        Collections.sort(feminino);
        Collections.sort(naoInformado);

        System.out.println("\nNomes Masculinos:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("\nNomes Femininos:");
        for (String nome : feminino) {
            System.out.println(nome);
        }

        System.out.println("\nNomes Não Informados:");
        for (String nome : naoInformado) {
            System.out.println(nome);
        }
    }
}


