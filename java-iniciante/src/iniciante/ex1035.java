package iniciante;

import java.util.Scanner;

public class ex1035 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, d;
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        c = Integer.parseInt(sc.nextLine());
        d = Integer.parseInt(sc.nextLine());

        if ( b > c && d > a
                && (b > c && d > a
                && c > 0 && d > 0
                && (c + d) > (a + b)
                && a % 2 == 0)){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
        sc.close();
    }
}
