package pagina66;

import java.util.Scanner;

public class Exercicio01H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base (B): ");
        int base = scanner.nextInt();

        System.out.println("Digite o expoente (E): ");
        int expoente = scanner.nextInt();

        long resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println("O resultado de " + base + "^" + expoente + " é: " + resultado);

        scanner.close();
    }
}