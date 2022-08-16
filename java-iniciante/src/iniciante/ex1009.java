package iniciante;

import java.util.Scanner;

public class ex1009 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();
        double total = salario + vendas*0.15;
        System.out.printf("%s Irá receber: %.2f",nome, total);
        sc.close();

    }
}
