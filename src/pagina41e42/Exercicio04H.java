package pagina41e42;

import java.util.Scanner;

public class Exercicio04H {
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

        System.out.println("Digite o quinto n�mero inteiro:");
        int num5 = scanner.nextInt();

        scanner.close();

        int maior = num1;
        int menor = num1;

        if (num2 > maior) {
            maior = num2;
        } else if (num2 < menor) {
            menor = num2;
        }

        if (num3 > maior) {
            maior = num3;
        } else if (num3 < menor) {
            menor = num3;
        }

        if (num4 > maior) {
            maior = num4;
        } else if (num4 < menor) {
            menor = num4;
        }

        if (num5 > maior) {
            maior = num5;
        } else if (num5 < menor) {
            menor = num5;
        }

        System.out.println("O maior n�mero �: " + maior);
        System.out.println("O menor n�mero �: " + menor);
    }
}