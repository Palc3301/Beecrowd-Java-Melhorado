package iniciante;

import java.util.Scanner;

public class ex1015 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x1, y1, x2, y2;
        x1 = Double.parseDouble(sc.nextLine());
        y1 = Double.parseDouble(sc.nextLine());
        x2 = Double.parseDouble(sc.nextLine());
        y2 = Double.parseDouble(sc.nextLine());
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println(String.format("%.4f", distancia));

        sc.close();
    }
}
