package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class ex1013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());

        int maiorab = (a + b + Math.abs(a - b) / 2);
        int maiorabc = (maiorab + c + Math.abs(maiorab - c)) / 2;

        System.out.println(maiorab + "eh o maior");

        sc.close();
    }
}
