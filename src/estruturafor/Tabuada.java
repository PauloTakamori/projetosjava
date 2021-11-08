package estruturafor;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        /*Tabuada
          leia o valor inteiro N, a seguir mostre a tabuada de N*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um Numero: ");
        int n  = sc.nextInt();

        for (int i = 1;i <= 10;i++){
            int resultado = n * i;
            System.out.println(i + " X " + n + " = " + resultado);
        }
        sc.close();

    }
}
