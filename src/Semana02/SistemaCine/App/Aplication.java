package Semana02.SistemaCine.App;

import Semana02.SistemaCine.core.Cinema;
import Semana02.SistemaCine.modelos.CinemaItem;
import Semana02.SistemaCine.modelos.Movie;
import Semana02.SistemaCine.modelos.Sala_de_cine;
import Semana02.SistemaCine.modelos.Usuario;

import java.util.List;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Cinema cine1 = new Cinema("Cineplanet");
        List<CinemaItem> CinemaItems = List.of(
            new Movie("El ojo del mañana",1,true,"Joseph Linarg", (short) 180, 14),
            new Movie("King Kong",2,true,"Steven Speilberg", (short) 120, 7),
            new Sala_de_cine("Sala2",1,true,90,2,true),
            new Sala_de_cine("Sala5",2,true,100,5,false)
        );
        List<Usuario> UserItems = List.of(
                new Usuario("Lucas",1),
                new Usuario("Sophia",2)
        );
        cine1.setCinemaItem(CinemaItems);
        cine1.setUserItem(UserItems);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Bienvenido al cine " + cine1.getName());
            System.out.println("Ingrese 1 para ver pelicula y salas");
            System.out.println("");
            int option = sc.nextInt();
            if(option==1){
                cine1.showItems();
            }
            if(option==3){
                System.out.println("Ingrese el usuario");
                String usuario = sc.next();
                System.out.println("Ingrese el titulo");
                String titulo = sc.next();
                cine1.registro(usuario, titulo);
            }
        }

    }
}
