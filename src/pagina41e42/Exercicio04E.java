package pagina41e42;

import java.util.Scanner;

public class Exercicio04E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("O valor de A deve ser diferente de zero.");
            scanner.close();
            return;
        }

        System.out.println("Digite o valor de B:");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor de C:");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("A equação possui uma raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }
        
        scanner.close();
    }
}