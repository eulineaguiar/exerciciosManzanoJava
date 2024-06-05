package pagina41e42;

import java.util.Scanner;

public class Exercicio04K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        int valor = scanner.nextInt();

        scanner.close();

        if (valor <= 3) {
            System.out.println("O valor é: " + valor);
        }
    }
}