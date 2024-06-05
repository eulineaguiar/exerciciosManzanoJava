package pagina25e26;

import java.util.Scanner;

public class Exercicio07M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor de C: ");
        double c = scanner.nextDouble();

        double somaDosValores = a + b + c;
        double quadradoDaSoma = somaDosValores * somaDosValores;

        System.out.println("O quadrado da soma de A, B e C é: " + quadradoDaSoma);

        scanner.close();
    }
}