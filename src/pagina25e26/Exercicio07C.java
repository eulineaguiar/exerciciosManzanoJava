package pagina25e26;

import java.util.Scanner;

public class Exercicio07C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura da lata de óleo (em cm): ");
        double altura = scanner.nextDouble();

        System.out.println("Digite o raio da lata de óleo (em cm): ");
        double raio = scanner.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("O volume da lata de óleo é: " + volume + " cm³");

        scanner.close();
    }
}