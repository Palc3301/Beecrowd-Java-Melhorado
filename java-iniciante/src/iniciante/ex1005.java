package iniciante;

import java.util.Scanner;

public class ex1005 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double media = (A*3.5 + B*7.5)/11;

        System.out.printf("MEDIA = %.4f",media);

        sc.close();
    }
}
