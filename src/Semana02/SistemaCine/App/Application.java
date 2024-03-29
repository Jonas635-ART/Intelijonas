package Semana02.SistemaCine.App;

import Semana02.SistemaCine.core.Cinema;
import Semana02.SistemaCine.modelos.CinemaItem;
import Semana02.SistemaCine.modelos.Movie;
import Semana02.SistemaCine.modelos.Sala_de_cine;
import Semana02.SistemaCine.modelos.Usuario;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Cinema cine1 = new Cinema("Cineplanet");

        List<CinemaItem> cinemaItems = List.of(
                new Movie("El ojo del mañana", 1, true, "Joseph Linarg", (short) 180, 14),
                new Movie("King Kong", 2, true, "Steven Speilberg", (short) 120, 7),
                new Sala_de_cine("Sala2", 1, true, 90, 2, true),
                new Sala_de_cine("Sala5", 2, true, 100, 5, false)
        );
        List<Usuario> userItems = List.of(
                new Usuario("Lucas", 1),
                new Usuario("Sophia", 2),
                new Usuario("Gerardo", 3)
        );
        cine1.setCinemaItems(cinemaItems);
        cine1.setUserLists(userItems);
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Bienvenido al cine " + cine1.getName());
            System.out.println("Ingrese 1 para ver pelicula y salas");
            System.out.println("Ingrese 2 para ver pelicula y salas");
            System.out.println("Ingrese 3 para colocar pelicula y sala");
            System.out.println("Ingrese 4 para registrar pelicula y los usuarios");
            System.out.println("Ingrese 5 para ver detalles pelicula y usuario");
            int option = sc.nextInt();
            if (option==1) {
                cine1.showItems2();
            }
            if (option==4) {
                System.out.println("Ingrese el usuario");
                String usuario = sc.next();
                System.out.println("Ingrese el titulo");
                String titulo = sc.next();
                cine1.registro(usuario, titulo);

            }
            if (option==5) {
                cine1.showItems();
            }
        }

    }
}
