package pagina46e47;

public class Exercicio01C {
	public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("O somat�rio dos valores pares na faixa de 1 at� 500 �: " + soma);
    }
}