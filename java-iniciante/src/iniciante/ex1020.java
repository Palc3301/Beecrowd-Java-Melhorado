package iniciante;

import java.util.Scanner;

public class ex1020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idadeDias = Integer.parseInt(sc.nextLine());
        int anos = idadeDias / 365;
        idadeDias = idadeDias % 365;

        int meses = idadeDias / 30;
        idadeDias = idadeDias % 30;
        int dias = idadeDias;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        sc.close();
    }
}
