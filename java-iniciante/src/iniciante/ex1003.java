package iniciante;

import java.util.Scanner;

public class ex1003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int soma = A + B;
        System.out.printf("SOMA = %d", soma);

        sc.close();
    }
}
