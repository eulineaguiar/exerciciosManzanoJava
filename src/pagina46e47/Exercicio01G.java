package pagina46e47;

public class Exercicio01G {
    public static void main(String[] args) {
        int termoAtual = 1;
        int termoAnterior = 0;

        System.out.println("S�rie de Fibonacci at� o d�cimo quinto termo:");

        for (int i = 1; i <= 15; i++) {
            System.out.print(termoAtual + " ");

            int proximoTermo = termoAtual + termoAnterior;
            termoAnterior = termoAtual;
            termoAtual = proximoTermo;
        }
    }
}