package pagina50;

import java.util.Scanner;

public class Exercicio01H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double areaTotal = 0;
        String resposta;

        do {
            System.out.println("Digite o nome do c�modo: ");
            String nome = scanner.nextLine();

            System.out.println("Digite a largura do c�modo em metros: ");
            double largura = scanner.nextDouble();

            System.out.println("Digite o comprimento do c�modo em metros: ");
            double comprimento = scanner.nextDouble();

            double area = largura * comprimento;
            areaTotal += area;

            System.out.println("A �rea do c�modo " + nome + " �: " + area + " metros quadrados");

            scanner.nextLine();

            System.out.println("Deseja calcular outro c�modo? (Digite SIM para continuar ou NAO para sair): ");
            resposta = scanner.nextLine().toUpperCase();
        } while (!resposta.equals("NAO"));

        System.out.println("A �rea total da resid�ncia �: " + areaTotal + " metros quadrados");

        scanner.close();
    }
}