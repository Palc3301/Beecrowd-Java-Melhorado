package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class ex1017 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempo, velocidade;
        tempo = Integer.parseInt(sc.nextLine());
        velocidade = Integer.parseInt(sc.nextLine());
        double km, media;
        km = tempo * velocidade;
        media = km / 12;

        System.out.printf( "%.3f", media);

    }
}
