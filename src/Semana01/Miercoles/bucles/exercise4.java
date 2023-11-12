package Semana01.Miercoles.bucles;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el N");

        int N = sc.nextInt();
        int resultado = 0;
        for(int i = 0; i < N+1; i++)
        {
            resultado = resultado + i;
        }
        System.out.println(resultado);
    }
}
