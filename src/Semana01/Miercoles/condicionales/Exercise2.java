package Semana01.Miercoles.condicionales;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short a, b;
        System.out.println("Ingresa el valor");
        a = sc.nextShort();
        System.out.println("Ingresa el valor");
        b = sc.nextShort();
        if (a==b){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
