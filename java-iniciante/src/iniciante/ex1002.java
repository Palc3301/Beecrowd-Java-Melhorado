package iniciante;
import java.util.Scanner;
import java.util.Locale;
public class ex1002 {

    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double entrada = sc.nextDouble();
        double n = 3.14159;
        double area = n * (entrada * entrada);
        System.out.printf("A=%.4f",area);

        sc.close();
    }
}
