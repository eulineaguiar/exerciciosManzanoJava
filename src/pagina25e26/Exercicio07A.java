package pagina25e26;

import java.util.Scanner;

public class Exercicio07A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);

        scanner.close();
    }
}