package pagina66;

public class Exercicio01E {
    public static void main(String[] args) {
        System.out.println("Valores numéricos inteiros ímpares de 0 a 20:");

        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}