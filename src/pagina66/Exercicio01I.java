package pagina66;

public class Exercicio01I {
    public static void main(String[] args) {
        int termo1 = 1;
        int termo2 = 1;
        int proximoTermo;

        System.out.println("Série de Fibonacci até o décimo quinto termo:");
        System.out.print(termo1 + ", " + termo2);

        for (int i = 3; i <= 15; i++) {
            proximoTermo = termo1 + termo2;
            System.out.print(", " + proximoTermo);
            termo1 = termo2;
            termo2 = proximoTermo;
        }

        System.out.println();
    }
}