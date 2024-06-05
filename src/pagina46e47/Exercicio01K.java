package pagina46e47;

import java.util.Scanner;

public class Exercicio01K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double areaTotal = 0;

        System.out.println("C�lculo da �rea total da resid�ncia:");

        String continuar = "SIM";
        while (continuar.equalsIgnoreCase("SIM")) {
            System.out.print("Nome do c�modo: ");
            String nome = scanner.next();
            System.out.print("Largura do c�modo (em metros): ");
            double largura = scanner.nextDouble();
            System.out.print("Comprimento do c�modo (em metros): ");
            double comprimento = scanner.nextDouble();

            double areaCadaComodo = largura * comprimento;
            System.out.println("�rea do c�modo " + nome + ": " + areaCadaComodo + " metros quadrados");

            areaTotal += areaCadaComodo;

            System.out.print("Deseja continuar calculando novos c�modos? (SIM/NAO): ");
            continuar = scanner.next();
        }

        System.out.println("�rea total da resid�ncia: " + areaTotal + " metros quadrados");

        scanner.close();
    }
}