package Semana01.Jueves;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la edad: ");
        byte edad = sc.nextByte();

        if(edad > 17){
            System.out.println("Mayor de edad, Bienvenido a la fiesta");
        }
        else {
            System.out.println("Menor de edad, Largate");
        }
    }
}
