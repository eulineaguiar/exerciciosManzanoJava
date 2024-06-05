package pagina41e42;

import java.util.Scanner;

public class Exercicio04C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota:");
        double nota4 = scanner.nextDouble();

        scanner.close();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média do aluno é: " + media);

        if (media >= 5) {
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno não foi aprovado.");
        }
    }
}