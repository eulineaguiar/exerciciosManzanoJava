package pagina25e26;

import java.util.Scanner;

public class Exercicio07F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor para a variável A: ");
        String a = scanner.nextLine();

        System.out.println("Digite o valor para a variável B: ");
        String b = scanner.nextLine();

        String temp = a;
        a = b;
        b = temp;

        System.out.println("Valores trocados:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        scanner.close();
    }
}