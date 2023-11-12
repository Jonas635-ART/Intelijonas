package Semana01.Excercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un valor:");
        int a = sc.nextInt();
        System.out.println("Ingresa un valor:");
        int b = sc.nextInt();

        int aux = a;
        a = b;
        b = aux;

        System.out.println(a);
        System.out.println(b);
    }
}
