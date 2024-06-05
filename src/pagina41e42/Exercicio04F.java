package pagina41e42;

import java.util.Scanner;

public class Exercicio04F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de B:");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor de C:");
        double c = scanner.nextDouble();

        scanner.close();

        double temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Os valores em ordem crescente são: " + a + ", " + b + ", " + c);
    }
}