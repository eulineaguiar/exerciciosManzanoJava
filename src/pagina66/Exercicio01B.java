package pagina66;

import java.util.Scanner;

public class Exercicio01B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de multiplicação para " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}