package pagina50;

import java.util.Scanner;

public class Exercicio01E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long somatorioFatorial = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.println("Digite o valor " + i + ": ");
            int valor = scanner.nextInt();

            long fatorial = calcularFatorial(valor);

            somatorioFatorial += fatorial;
        }

        System.out.println("O somatório das fatoriais é: " + somatorioFatorial);

        scanner.close();
    }

    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i = 2; i <= n; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}