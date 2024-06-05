package pagina46e47;

import java.util.Scanner;

public class Exercicio01K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double areaTotal = 0;

        System.out.println("Cálculo da área total da residência:");

        String continuar = "SIM";
        while (continuar.equalsIgnoreCase("SIM")) {
            System.out.print("Nome do cômodo: ");
            String nome = scanner.next();
            System.out.print("Largura do cômodo (em metros): ");
            double largura = scanner.nextDouble();
            System.out.print("Comprimento do cômodo (em metros): ");
            double comprimento = scanner.nextDouble();

            double areaCadaComodo = largura * comprimento;
            System.out.println("Área do cômodo " + nome + ": " + areaCadaComodo + " metros quadrados");

            areaTotal += areaCadaComodo;

            System.out.print("Deseja continuar calculando novos cômodos? (SIM/NAO): ");
            continuar = scanner.next();
        }

        System.out.println("Área total da residência: " + areaTotal + " metros quadrados");

        scanner.close();
    }
}