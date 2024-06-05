package pagina25e26;

import java.util.Scanner;

public class Exercicio07L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor de C: ");
        double c = scanner.nextDouble();

        double somaDosQuadrados = (a * a) + (b * b) + (c * c);

        System.out.println("A soma dos quadrados de A, B e C é: " + somaDosQuadrados);

        scanner.close();
    }
}