package Semana01.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Ingresa el tamanio");
        int tamanio = sc.nextInt();
        int[] nros = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {
            nros[i] = rand.nextInt(100);
        }
        System.out.println("Ingresa el dato a buscar");
        int m = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < tamanio; i++) {
            if(nros[i]==m){
               encontrado = true;
               break;
            }

        }
        if(encontrado){
            System.out.println("el valor si existe");
        }
        else{
            System.out.println("el valor no existe");
        }
    }
}
