package pagina25e26;

import java.util.Scanner;

public class Exercicio07B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * (5.0 / 9.0);

        System.out.println("A temperatura em graus Celsius é: " + celsius);

        scanner.close();
    }
}