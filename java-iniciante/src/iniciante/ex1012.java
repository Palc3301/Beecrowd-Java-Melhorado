package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class ex1012 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double triangulo = a * c / 2.0;
        double circulo = 3.14159 * Math.pow(c,2.0);
        double trapezio = ((a + b) * c) / 2.0;
        double quadrado = Math.pow(b,2.0);
        double retangulo = a * b;
        System.out.println(String.format("TRIANGULO: %.3f", triangulo));
        System.out.println(String.format("CIRCULO: %.3f", circulo));
        System.out.println(String.format("TRAPEZIO: %.3f", trapezio));
        System.out.println(String.format("QUADRADO: %.3f", quadrado));
        System.out.println(String.format("RETANGULO: %.3f", retangulo));

        sc.close();
    }
}
