package pagina66;

public class Exercicio01K {
    public static void main(String[] args) {
        System.out.println("Fatorial dos valores ímpares de 1 a 10:");

        for (int i = 1; i <= 10; i += 2) {
            long fatorial = 1;
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.println("Fatorial de " + i + " é: " + fatorial);
        }
    }
}