package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class ex1010 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String [] entrada = null;
        double resultado = 0;
        for (int i = 0; i < 5; i++) {
            entrada= sc.nextLine().split(" ");
            double qtd = Double.parseDouble(entrada[1]);
            double valor = Double.parseDouble(entrada[2]);
            resultado += qtd*valor;
        }
        System.out.printf("TOTAL: %.2f", resultado);
        sc.close();
    }
}
