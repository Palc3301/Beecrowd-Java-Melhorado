package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class ex1036 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        a = Double.parseDouble(sc.nextLine());
        b = Double.parseDouble(sc.nextLine());
        c = Double.parseDouble(sc.nextLine());

        if ((a == 0) | (b * b - 4 * a * c < 0)) {
            System.out.println("Impossivel calcular");
        } else {
            double bhaskara, r1, r2;
            bhaskara = Math.sqrt(Math.pow(b,2) - 4 * a * c);
            r1 = (-b + bhaskara) / (2 * a);
            r2 = (-b - bhaskara) / (2 * a);

            System.out.println(String.format("R1 = %.5f", r1));
            System.out.println(String.format("R2 = %.5f", r2));
        }
        sc.close();
    }
}
