package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class ex1011 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double pi, raio, raio3, total;
        raio = sc.nextDouble();
        pi = 3.14159;
        raio3 = Math.pow(raio,3);
        total = (4/3.0) * pi * raio3;
        System.out.printf("VOLUME = %.3f", total);

        sc.close();
    }
}
