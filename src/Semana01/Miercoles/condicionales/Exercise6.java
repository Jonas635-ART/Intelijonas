package Semana01.Miercoles.condicionales;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la nota de math");
        int math = sc.nextInt();
        System.out.println("Ingresa la nota de fisic");
        int fisc = sc.nextInt();
        System.out.println("Ingresa la nota de chemical");
        int chemical = sc.nextInt();

        int sumaNotas = math +fisc+chemical;
        int sumaopar = math + fisc;
        if((math >= 65) && (fisc >= 65) && (chemical >=50) && (sumaNotas >=140) || sumaopar >=140){
            System.out.println("Ingreso");
        }
        else{
            System.out.println("No ingreso");
        }
    }
}
