package Semana02.Sistema_biblioteca.App;

import Semana02.Sistema_biblioteca.Modelos.Book;
import Semana02.Sistema_biblioteca.Modelos.DVD;
import Semana02.Sistema_biblioteca.Modelos.LibraryItem;
import Semana02.Sistema_biblioteca.Modelos.LibraryUser;
import Semana02.Sistema_biblioteca.core.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Library library1 = new Library("Juana Aracalla");
        // crear items en library
        List<LibraryItem> libraryItems = List.of(
                new Book("The lord Daon", 1, true, "J. Karfel"),
                new Book("El quijote", 2, true, "M. Cervantes"),
                new DVD("F1 Racing", 3, true, "H. F. Sangler", (short) 180)
        );
        //crear usuarios
        List<LibraryUser> userList = List.of(
                new LibraryUser("Jose", 1),
                new LibraryUser("Kelia", 2)
        );
        library1.setLibraryItem(libraryItems);
        library1.setUserList(userList);

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Bienvenido a biblioteca " + library1.getName());
            System.out.println("Ingrese 1 para ver los items");
            System.out.println("Ingrese 2 para ver los usuarios");
            System.out.println("Ingrese 3 para pedir un prestamo");
            System.out.println("Ingrese 4 para ver la informacion de un usuario");
            System.out.println("Ingrese 5 para devolver un item");
            int option = sc.nextInt();
            if(option==1){
                library1.showItems();
            }
            if(option==3){
                System.out.println("Ingrese el usuario");
                String usuario = sc.next();
                System.out.println("Ingrese el titulo");
                String titulo = sc.next();
                library1.prestamo(usuario, titulo);
            }

        }
    }
}
