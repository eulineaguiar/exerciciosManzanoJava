package pagina41e42;

import java.util.Scanner;

public class Exercicio04G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro n�mero inteiro:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo n�mero inteiro:");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro n�mero inteiro:");
        int num3 = scanner.nextInt();

        System.out.println("Digite o quarto n�mero inteiro:");
        int num4 = scanner.nextInt();

        scanner.close();

        System.out.println("N�meros divis�veis por 2 e 3:");

        if (num1 % 2 == 0 && num1 % 3 == 0) {
            System.out.println(num1);
        }

        if (num2 % 2 == 0 && num2 % 3 == 0) {
            System.out.println(num2);
        }

        if (num3 % 2 == 0 && num3 % 3 == 0) {
            System.out.println(num3);
        }

        if (num4 % 2 == 0 && num4 % 3 == 0) {
            System.out.println(num4);
        }
    }
}