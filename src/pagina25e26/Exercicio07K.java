package pagina25e26;

import java.util.Scanner;

public class Exercicio07K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cota��o do d�lar: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.println("Digite a quantidade de reais dispon�vel: ");
        double quantidadeReais = scanner.nextDouble();

        double valorEmDolares = quantidadeReais / cotacaoDolar;

        System.out.println("O valor em d�lares �: US$ " + valorEmDolares);

        scanner.close();
    }
}