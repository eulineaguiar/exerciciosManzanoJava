package pagina66;

public class Exercicio01F {
    public static void main(String[] args) {
        System.out.println("Números divisíveis por 4 menores que 200:");

        for (int i = 1; i < 200; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}