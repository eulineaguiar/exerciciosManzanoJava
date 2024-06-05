package pagina25e26;

import java.util.Scanner;

public class Exercicio07H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento da caixa (em cm): ");
        double comprimento = scanner.nextDouble();

        System.out.println("Digite a largura da caixa (em cm): ");
        double largura = scanner.nextDouble();

        System.out.println("Digite a altura da caixa (em cm): ");
        double altura = scanner.nextDouble();

        double volume = comprimento * largura * altura;

        System.out.println("O volume da caixa é: " + volume + " cm³");

        scanner.close();
    }
}