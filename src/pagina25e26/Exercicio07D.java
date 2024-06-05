package pagina25e26;

import java.util.Scanner;

public class Exercicio07D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tempo gasto na viagem (em horas): ");
        double tempo = scanner.nextDouble();

        System.out.println("Digite a velocidade m�dia durante a viagem (em Km/h): ");
        double velocidade = scanner.nextDouble();

        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12;

        System.out.println("Velocidade m�dia: " + velocidade + " Km/h");
        System.out.println("Tempo gasto na viagem: " + tempo + " horas");
        System.out.println("Dist�ncia percorrida: " + distancia + " Km");
        System.out.println("Quantidade de litros de combust�vel utilizada: " + litrosUsados + " litros");

        scanner.close();
    }
}