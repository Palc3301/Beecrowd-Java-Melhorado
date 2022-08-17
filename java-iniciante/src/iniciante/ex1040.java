package iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ex1040 {

    public static void main(String[] args) {
        //irei terminar
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double n1, n2, n3, n4, media;
        n1 = Double.parseDouble(sc.nextLine());
        n2 = Double.parseDouble(sc.nextLine());
        n3 = Double.parseDouble(sc.nextLine());
        n4 = Double.parseDouble(sc.nextLine());

        media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado");
        } else if (media < 7 && media >= 5) {
            System.out.println("Aluno em exame.");
            double nExame = Double.parseDouble(sc.nextLine());
            System.out.printf("Nota do exame: %.1f\n",nExame);
            media = (media + nExame) / 2;
            if (media >=5){
                System.out.println("Aluno reprovado.");
            }
            else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %1f/n",media);
        }
    }
}
