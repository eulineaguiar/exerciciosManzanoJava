package pagina46e47;

public class Exercicio01E {
    public static void main(String[] args) {
        System.out.println("Resultados das potências de 3:");

        for (int expoente = 0; expoente <= 15; expoente++) {
            long resultado = potenciaDeTres(expoente);
            System.out.println("3^" + expoente + " = " + resultado);
        }
    }

    public static long potenciaDeTres(int expoente) {
        if (expoente == 0) {
            return 1;
        } else if (expoente == 1) {
            return 3;
        } else {
            long resultado = 3;
            for (int i = 2; i <= expoente; i++) {
                resultado *= 3;
            }
            return resultado;
        }
    }
}