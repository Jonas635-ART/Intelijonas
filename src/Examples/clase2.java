package Examples;

import java.util.Scanner;

public class clase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nota 1");
        int math = sc.nextInt();
        System.out.println("Ingrese nota 2");
        int science = sc.nextInt();
        System.out.println("Ingrese nota 3");
        int gramary = sc.nextInt();
        int resultado = science + math;

        if(math + science + gramary >=47 || resultado>=30){
            System.out.println("Pasa de año");
        }
        else{
            System.out.println("Repite");
        }

    }
}
