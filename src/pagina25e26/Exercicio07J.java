package pagina25e26;

import java.util.Scanner;

public class Exercicio07J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cota��o do d�lar: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.println("Digite a quantidade de d�lares dispon�vel: ");
        double quantidadeDolares = scanner.nextDouble();

        double valorEmReais = quantidadeDolares * cotacaoDolar;

        System.out.println("O valor em reais �: R$ " + valorEmReais);

        scanner.close();
    }
}