package pagina46e47;

public class Exercicio01D {
    public static void main(String[] args) {
        System.out.println("Valores num�ricos inteiros �mpares na faixa de 0 a 20:");

        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}