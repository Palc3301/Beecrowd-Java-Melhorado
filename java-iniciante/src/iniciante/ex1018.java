package iniciante;

import java.util.Scanner;

public class ex1018 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor = Integer.parseInt(sc.nextLine());

        System.out.println(valor / 100 + "nota(s) de R$ 100,00");
        valor = valor % 100;
        System.out.println(valor / 50 + " nota(s) de R$ 100,00");
        valor = valor % 50;
        System.out.println(valor / 20 + " nota(s) de R$ 100,00");
        valor = valor % 20;
        System.out.println(valor / 10 + " nota(s) de R$ 100,00");
        valor = valor % 10;
        System.out.println(valor / 5 + " nota(s) de R$ 100,00");
        valor = valor % 5;
        System.out.println(valor / 2 + " nota(s) de R$ 100,00");
        valor = valor % 2;
        System.out.println(valor / 1 + " nota(s) de R$ 100,00");

        sc.close();
    }
}
