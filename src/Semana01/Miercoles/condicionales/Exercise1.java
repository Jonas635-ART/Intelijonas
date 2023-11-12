package Semana01.Miercoles.condicionales;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un dato:");
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println("Es par");
        }
        else{
            System.out.println("es impar");
        }

    }
}
