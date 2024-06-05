package pagina66;

public class Exercicio01J {
    public static void main(String[] args) {
        System.out.println("Conversão de graus Celsius em Fahrenheit de 10 em 10 graus:");

        for (int celsius = 10; celsius <= 100; celsius += 10) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
            System.out.println(celsius + "°C = " + fahrenheit + "°F");
        }
    }
}