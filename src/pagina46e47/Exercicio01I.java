package pagina46e47;

import java.util.Scanner;

public class Exercicio01I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;

        System.out.println("Digite 10 valores numéricos:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            total += valor;
        }

        double media = (double) total / 10;

        System.out.println("Total do somatório: " + total);
        System.out.println("Média aritmética: " + media);

        scanner.close();
    }
}