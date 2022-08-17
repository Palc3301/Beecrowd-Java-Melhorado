package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class ex1010 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double pi = 3.14159;
        double raio = sc.nextDouble();
        double volume = (4.0/3)*pi*Math.pow(raio, 3);
        System.out.printf("%.3f",volume);

        sc.close();
    }
}
