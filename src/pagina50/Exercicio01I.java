package pagina50;

import java.util.Scanner;

public class Exercicio01I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite valores inteiros positivos (digite um valor negativo para encerrar):");

        while (true) {
            System.out.println("Digite um valor: ");
            int valor = scanner.nextInt();

            if (valor < 0) {
                break;
            }

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }
        }

        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("O maior valor informado é: " + maior);
            System.out.println("O menor valor informado é: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }

        scanner.close();
    }
}