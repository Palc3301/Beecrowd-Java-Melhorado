package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class ex1014 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = Integer.parseInt(sc.nextLine());
        double y = Double.parseDouble(sc.nextLine());
        double kmL = x/y;

        System.out.printf("%.3f km/l", kmL);
    }
}
