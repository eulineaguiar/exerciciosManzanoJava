package pagina25e26;

import java.util.Scanner;

public class Exercicio07E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da prestação: ");
        double valor = scanner.nextDouble();

        System.out.println("Digite a taxa de juros (em %): ");
        double taxa = scanner.nextDouble();

        System.out.println("Digite o tempo de atraso (em meses): ");
        double tempo = scanner.nextDouble();

        double prestacao = valor + (valor * taxa / 100) * tempo;

        System.out.println("O valor da prestação em atraso é: " + prestacao);

        scanner.close();
    }
}