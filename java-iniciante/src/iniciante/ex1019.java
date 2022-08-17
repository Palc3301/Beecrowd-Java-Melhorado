package iniciante;

import java.util.Scanner;

public class ex1019 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int segundos = Integer.parseInt(sc.nextLine());
        int horas = segundos / 3600;
        segundos = segundos % 3600;

        int minutos = segundos / 60;
        segundos =segundos %60;

        int segundoRestantes = segundos;
        System.out.print(horas + ":" + minutos + ":" + segundoRestantes);
        //System.out.printf("%d:%d:%d%n", horas,minutos,segundoRestantes);
        sc.close();
    }
}
