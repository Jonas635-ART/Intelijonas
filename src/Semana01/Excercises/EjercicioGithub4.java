package Semana01.Excercises;

import java.util.Scanner;

public class EjercicioGithub4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un N");
        int N = sc.nextInt();
        int resultado = N--;
        if(N%2>0){
            System.out.println(resultado);
        }
    }
}
