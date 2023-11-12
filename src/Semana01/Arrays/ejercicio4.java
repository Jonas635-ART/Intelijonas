package Semana01.Arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

//listas
public class ejercicio4 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Fernando");
        System.out.println(nombres.get(0));
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa nombre");
            String nombre = String.valueOf(rand.nextInt(2000));
            nombres.add(nombre);
        }
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        nombres.remove(0);
    }
}
