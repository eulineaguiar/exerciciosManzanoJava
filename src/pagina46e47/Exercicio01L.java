package pagina46e47;

import java.util.Scanner;

public class Exercicio01L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite valores positivos inteiros (digite um valor negativo para encerrar):");

        int valor;
        do {
            System.out.println("Digite um valor: ");
            valor = scanner.nextInt();

            if (valor >= 0) {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }
        } while (valor >= 0);

        if (maior != Integer.MIN_VALUE) {
            System.out.println("Maior valor informado: " + maior);
            System.out.println("Menor valor informado: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }

        scanner.close();
    }
}