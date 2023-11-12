package Examples;

import java.util.Scanner;

public class CLase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor");
        int value = sc.nextInt();
        System.out.println("Ingrese el 2 valor");
        int value2= sc.nextInt();
        int resultado = value * value2;
        System.out.println("El resultado es:" + resultado);

    }
}
