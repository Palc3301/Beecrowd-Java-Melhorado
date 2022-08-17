package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class ex1038 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        if (a == 1) {
            double a1 = 4.00;
            double total = a1 * b;
            System.out.printf("Total: R$ %.2f", total);
        } else if (a == 2) {
            double a2 = 4.50;
            double total = a2 * b;
            System.out.printf("Total: R$ %.2f", total);
        } else if (a == 3) {
            double a3 = 5.00;
            double total = a3 * b;
            System.out.printf("Total: R$ %.2f", total);
        } else if (a == 4) {
            double a4 = 2.00;
            double total = a4 * b;
            System.out.printf("Total: R$ %.2f", total);
        } else if (a == 5) {
            double a5 = 1.50;
            double total = a5 * b;
            System.out.printf("Total: R$ %.2f", total);
        } else {
            System.out.println("Não tem no cardapio");
        }
        sc.close();
    }
}