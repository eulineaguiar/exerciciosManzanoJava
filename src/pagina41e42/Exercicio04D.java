package pagina41e42;

import java.util.Scanner;

public class Exercicio04D {
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

        System.out.println("A m�dia do aluno �: " + media);

        if (media >= 7) {
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno n�o atingiu a m�dia m�nima.");
            System.out.println("Digite a nota do exame:");
            double notaExame = scanner.nextDouble();
            double novaMedia = (media + notaExame) / 2;
            System.out.println("A nova m�dia do aluno �: " + novaMedia);
            if (novaMedia >= 5) {
                System.out.println("O aluno foi aprovado em exame!");
            } else {
                System.out.println("O aluno n�o foi aprovado.");
            }
        }
    }
}