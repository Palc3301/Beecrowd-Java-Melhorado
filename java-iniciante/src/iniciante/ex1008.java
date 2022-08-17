package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class ex1008 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double codigo = sc.nextDouble();
        double qtdHoras = sc.nextDouble();
        double salario = sc.nextDouble();
        double resultado = qtdHoras*salario;
        System.out.printf("NUMBER = %.2f\nSALARY = U$ %.2f", codigo, resultado);

        sc.close();
    }
}
