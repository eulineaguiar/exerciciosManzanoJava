package pagina50;

public class Exercicio01D {
    public static void main(String[] args) {
        double totalGrãos = 0;

        for (int i = 1; i <= 64; i++) {
            double grãosNoQuadrado = Math.pow(2, i - 1);
            totalGrãos += grãosNoQuadrado;
        }

        System.out.println("O somatório do número de grãos de trigo é: " + totalGrãos);
    }
}