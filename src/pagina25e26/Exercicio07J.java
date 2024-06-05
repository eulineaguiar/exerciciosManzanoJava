package pagina25e26;

import java.util.Scanner;

public class Exercicio07J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.println("Digite a quantidade de dólares disponível: ");
        double quantidadeDolares = scanner.nextDouble();

        double valorEmReais = quantidadeDolares * cotacaoDolar;

        System.out.println("O valor em reais é: R$ " + valorEmReais);

        scanner.close();
    }
}