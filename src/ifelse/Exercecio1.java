package ifelse;

import java.util.Locale;
import java.util.Scanner;

public class Exercecio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira Nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda Nota: ");
        double nota2 = sc.nextDouble();
        double notaFinal = nota1 + nota2;

        System.out.printf("Nota Final: %.1f%n", notaFinal);

        if (notaFinal >= 60.0){
            System.out.println("Aprovado!!");
        }else {
            System.out.println("Reprovado!!");
        }


    }
}
