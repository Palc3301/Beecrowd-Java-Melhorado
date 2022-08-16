package iniciante;

import java.util.Scanner;
import java.util.Locale;

public class ex1004 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int prod = A*B;
        System.out.printf("PROD = %d", prod);

        sc.close();
    }
}
