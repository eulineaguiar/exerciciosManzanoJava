package pagina25e26;

import java.util.Scanner;

public class Exercicio07I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = scanner.nextInt();

        int diferenca = a - b;
        int resultado = diferenca * diferenca;

        System.out.println("O quadrado da diferença entre A e B é: " + resultado);

        scanner.close();
    }
}