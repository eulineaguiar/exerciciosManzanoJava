package pagina41e42;

import java.util.Scanner;

public class Exercicio04L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o sexo (M para masculino, F para feminino):");
        char sexo = scanner.next().charAt(0);

        scanner.close();

        if (sexo == 'M' || sexo == 'm') {
            System.out.println("Ilmo Sr. " + nome);
        } else if (sexo == 'F' || sexo == 'f') {
            System.out.println("Ilma Sra. " + nome);
        } else {
            System.out.println("Sexo inválido.");
        }
    }
}