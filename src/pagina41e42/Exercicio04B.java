package pagina41e42;

import java.util.Scanner;

public class Exercicio04B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int numero = scanner.nextInt();
        scanner.close();
        
        if(numero < 0) {
            numero *= -1;
        }
        
        System.out.println("O valor absoluto do número fornecido é: " + numero);
    }
}