package pagina50;

import java.util.Scanner;

public class Exercicio01H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double areaTotal = 0;
        String resposta;

        do {
            System.out.println("Digite o nome do cômodo: ");
            String nome = scanner.nextLine();

            System.out.println("Digite a largura do cômodo em metros: ");
            double largura = scanner.nextDouble();

            System.out.println("Digite o comprimento do cômodo em metros: ");
            double comprimento = scanner.nextDouble();

            double area = largura * comprimento;
            areaTotal += area;

            System.out.println("A área do cômodo " + nome + " é: " + area + " metros quadrados");

            scanner.nextLine();

            System.out.println("Deseja calcular outro cômodo? (Digite SIM para continuar ou NAO para sair): ");
            resposta = scanner.nextLine().toUpperCase();
        } while (!resposta.equals("NAO"));

        System.out.println("A área total da residência é: " + areaTotal + " metros quadrados");

        scanner.close();
    }
}