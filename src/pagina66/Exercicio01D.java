package pagina66;

public class Exercicio01D {
    public static void main(String[] args) {
        int somatorio = 0;

        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                somatorio += i;
            }
        }

        System.out.println("O somat�rio dos valores pares de 1 at� 500 �: " + somatorio);
    }
}