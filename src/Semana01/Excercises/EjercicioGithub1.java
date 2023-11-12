package Semana01.Excercises;

import java.util.Scanner;

public class EjercicioGithub1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas");
        int h_trabajo = sc.nextInt();
        System.out.println("Ingrese horas extras");
        int h_extra = sc.nextInt();
        int h_sueldo = 40;
        int resultado = ((h_trabajo * h_sueldo) + h_extra * (h_sueldo*2));
        int resultado2 = ((h_trabajo * h_sueldo) + h_extra * (h_sueldo*3));
        if((h_trabajo + h_extra >= 40) && (h_extra <= 8)){
            System.out.println(resultado);
        }
        if((h_trabajo + h_extra >= 40) && (h_extra > 8)){
            System.out.println(resultado2);
        }

        else{
            System.out.println("Nada");
        }

    }
}
