package pagina25e26;

import java.util.Scanner;

public class Exercicio07G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor para a variável A: ");
        int a = scanner.nextInt();
        System.out.println("Digite o valor para a variável B: ");
        int b = scanner.nextInt();
        System.out.println("Digite o valor para a variável C: ");
        int c = scanner.nextInt();
        System.out.println("Digite o valor para a variável D: ");
        int d = scanner.nextInt();

        int resultado1 = a * b;
        int resultado2 = a * c;
        int resultado3 = a * d;
        int resultado4 = b * c;
        int resultado5 = b * d;
        int resultado6 = c * d;

        int soma1 = a + b;
        int soma2 = a + c;
        int soma3 = a + d;
        int soma4 = b + c;
        int soma5 = b + d;
        int soma6 = c + d;

        System.out.println("Resultados da adição:");
        System.out.println("A + B = " + soma1);
        System.out.println("A + C = " + soma2);
        System.out.println("A + D = " + soma3);
        System.out.println("B + C = " + soma4);
        System.out.println("B + D = " + soma5);
        System.out.println("C + D = " + soma6);

        System.out.println("Resultados da multiplicação:");
        System.out.println("A * B = " + resultado1);
        System.out.println("A * C = " + resultado2);
        System.out.println("A * D = " + resultado3);
        System.out.println("B * C = " + resultado4);
        System.out.println("B * D = " + resultado5);
        System.out.println("C * D = " + resultado6);

        scanner.close();
    }
}