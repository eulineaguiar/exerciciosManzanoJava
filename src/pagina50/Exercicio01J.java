package pagina50;

import java.util.Scanner;

public class Exercicio01J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.println("Digite o divisor: ");
        int divisor = scanner.nextInt();

        int quociente = 0;
        int resto = dividendo;

        while (resto >= divisor) {
            resto -= divisor;
            quociente++;
        }

        System.out.println("O quociente da divisão é: " + quociente);

        scanner.close();
    }
}