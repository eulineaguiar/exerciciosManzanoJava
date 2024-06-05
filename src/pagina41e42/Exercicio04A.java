package pagina41e42;

import java.util.Scanner;

public class Exercicio04A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor inteiro: ");
        int primeiroValor = scanner.nextInt();
        System.out.println("Digite o segundo valor inteiro: ");
        int segundoValor = scanner.nextInt();
        scanner.close();
        int diferenca;
        if (primeiroValor > segundoValor) {
            diferenca = primeiroValor - segundoValor;
        } else {
            diferenca = segundoValor - primeiroValor;
        }
        System.out.println("A diferença entre o maior e o menor valor é: " + diferenca);
    }
}