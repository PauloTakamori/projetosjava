package ifelse;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //intervalo: leia o valor e mostre em qual intenvalo ele esta:([0.25],[25.50],[50.75],[75.100])

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        if (n < 0.0 || n > 100){
            System.out.println("Fora do Intervalo!!!!");
        }else if (n <= 25.0){
            System.out.println("Voce esta no intervalo [0 a 25]");
        }else if (n <= 50.0){
            System.out.println("Voce esta no intervalo [25 a 50]");
        }else if (n <= 75.0){
            System.out.println("Voce esta no intervalo [50 a 75]");
        }else if (n <= 100.0){
            System.out.println("Voce esta no intervalo [75 a 100]");
        }
        sc.close();



    }
}
