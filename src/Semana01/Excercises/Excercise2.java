package Semana01.Excercises;

import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un nro:");
        int num1 = sc.nextInt();
        System.out.println("Ingresa un nro:");
        int num2 = sc.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println((float) (num1 + num2)/2);
    }
}
