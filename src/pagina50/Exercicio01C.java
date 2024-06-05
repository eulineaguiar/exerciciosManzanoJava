package pagina50;

public class Exercicio01C {
    public static void main(String[] args) {
        int contador = 1;

        while (contador < 200) {
            if (contador % 4 == 0) {
                System.out.println(contador);
            }
            contador++;
        }
    }
}