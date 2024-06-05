package pagina50;

import java.util.Scanner;

public class Exercicio01F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalValores = 0;
        int soma = 0;
        double media = 0;

        System.out.println("Digite valores numéricos positivos (digite um valor negativo para encerrar):");

        while (true) {
            System.out.println("Digite um valor: ");
            int valor = scanner.nextInt();

            if (valor < 0) {
                break;
            }

            totalValores++;
            soma += valor;
        }

        if (totalValores > 0) {
            media = (double) soma / totalValores;
        }

        System.out.println("Total do somatório: " + soma);
        System.out.println("Média aritmética: " + media);
        System.out.println("Total de valores lidos: " + totalValores);

        scanner.close();
    }
}