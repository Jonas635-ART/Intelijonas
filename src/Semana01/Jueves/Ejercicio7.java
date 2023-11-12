package Semana01.Jueves;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el edad:");
        byte edad = sc.nextByte();
        System.out.println("Ingrese su altura:");
        byte altura = sc.nextByte();

        if(edad >= 18 && altura >= 18) {
            System.out.println("Apto para la Marina");
        }
        else {
            System.out.println("Bienvenido a la Armada");
        }


    }
}
