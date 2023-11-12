package Semana01.Excercises;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        final float pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el radio en metros");
        float radio = sc.nextFloat();
        float area = pi*radio*radio;
        System.out.println(area);

    }
}
