package Semana01.Jueves;

import java.util.Scanner;
//Herramienta scanner
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        byte edad = sc.nextByte();
        System.out.println("la edad es: " + edad);
    }
}
