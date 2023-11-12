package Semana01.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Ingresa el array");
        int tamanio = sc.nextInt();
        int[] listnros = new int[tamanio];

        for(int i = 0; i< tamanio; i++) {
            listnros[i] = rand.nextInt(45);
        }
        System.out.println("Imprimiendo el array");
        for(int i = 0; i< tamanio; i++) {
            System.out.println(listnros[i]);
        }
        int suma = 0;
        for(int i = 0; i < tamanio; i++){
            suma = suma + listnros[i];
        }
        System.out.println("la suma es:" + suma);
    }
}
