package pagina46e47;
import java.util.Scanner;

public class Exercicio01A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um n�mero para gerar a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de multiplica��o para o n�mero " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}