package Semana01.Excercises;

import java.util.Scanner;

public class EjercicioGithub2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la edad");
        int edad = sc.nextInt();
        System.out.println("Ingrese regalos");
        int regalo = sc.nextInt();

        if((edad >= 15) && (regalo >= 1) || (edad < 15) ){
            System.out.println("Ingresa a la fiesta");

        }
        else {
            System.out.println("No ingresa");
        }

    }
}
