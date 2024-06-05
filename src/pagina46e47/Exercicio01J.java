package pagina46e47;

public class Exercicio01J {
    public static void main(String[] args) {
        int soma = 0;
        int quantidadePares = 0;

        System.out.println("Valores pares na faixa de 50 a 70:");

        for (int i = 50; i <= 70; i++) {
            if (i % 2 == 0) {
                soma += i;
                quantidadePares++;
                System.out.print(i + " ");
            }
        }

        double media = (double) soma / quantidadePares;

        System.out.println("\nSoma dos valores pares: " + soma);
        System.out.println("Média aritmética dos valores pares: " + media);
    }
}