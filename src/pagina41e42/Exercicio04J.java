package pagina41e42;

import java.util.Scanner;

public class Exercicio04J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor entre 1 e 9:");
        int valor = scanner.nextInt();

        scanner.close();

        if (valor >= 1 && valor <= 9) {
            System.out.println("O valor está na faixa permitida.");
        } else {
            System.out.println("O valor está fora da faixa permitida.");
        }
    }
}