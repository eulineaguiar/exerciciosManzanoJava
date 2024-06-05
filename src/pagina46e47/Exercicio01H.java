package pagina46e47;

public class Exercicio01H {
    public static void main(String[] args) {
        System.out.println("Conversão de graus Celsius para Fahrenheit:");

        for (int celsius = 10; celsius <= 100; celsius += 10) {
            double fahrenheit = converterCelsiusParaFahrenheit(celsius);
            System.out.println(celsius + " graus Celsius = " + fahrenheit + " graus Fahrenheit");
        }
    }

    public static double converterCelsiusParaFahrenheit(int celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }
}