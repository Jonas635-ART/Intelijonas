package Semana01.Arrays;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamanio del array");
        int tamArray = sc.nextInt();

        int[] edades = new int[tamArray];
        for(int i = 0; i < tamArray; i++){
            edades[i] = i+10;
            System.out.println(edades[i]);
        }



    }
}
