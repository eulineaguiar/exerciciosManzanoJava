package pagina66;

public class Exercicio01G {
    public static void main(String[] args) {
        System.out.println("Resultados das potências de 3:");

        for (int expoente = 0; expoente <= 15; expoente++) {
            long resultado = 1;
            for (int i = 0; i < expoente; i++) {
                resultado *= 3;
            }
            System.out.println("3^" + expoente + " = " + resultado);
        }
    }
}