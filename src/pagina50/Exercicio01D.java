package pagina50;

public class Exercicio01D {
    public static void main(String[] args) {
        double totalGr�os = 0;

        for (int i = 1; i <= 64; i++) {
            double gr�osNoQuadrado = Math.pow(2, i - 1);
            totalGr�os += gr�osNoQuadrado;
        }

        System.out.println("O somat�rio do n�mero de gr�os de trigo �: " + totalGr�os);
    }
}