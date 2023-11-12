package Semana02.Sistema_biblioteca.core;
import Semana02.Sistema_biblioteca.Modelos.LibraryItem;
import Semana02.Sistema_biblioteca.Modelos.LibraryUser;

import java.util.ArrayList;
import java.util.List;
public class Library {
    private String name;
    private List<LibraryItem> LibraryItem;
    private List<LibraryUser> userList;

    public Library(String name){
        this.name = name;
        this.LibraryItem = new ArrayList<>();
        this.userList = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Semana02.Sistema_biblioteca.Modelos.LibraryItem> getLibraryItem() {
        return LibraryItem;
    }

    public void setLibraryItem(List<Semana02.Sistema_biblioteca.Modelos.LibraryItem> libraryItem) {
        LibraryItem = libraryItem;
    }

    public List<LibraryUser> getUserList() {
        return userList;
    }

    public void setUserList(List<LibraryUser> userList) {
        this.userList = userList;
    }
    public void showItems(){
        for(LibraryItem item: this.LibraryItem){
            item.showinfo();
            System.out.println("-------------new-------");
        }
    }
    public void prestamo(String username, String title){
        LibraryUser userFound = null;
        for(LibraryUser user: this.userList){
            if(user.getUsername().equals(username)){
                userFound = user;
                break;

            }
        }
        if(userFound == null){
            System.out.println("USUARIO no encontrado");
            return;

        }
        LibraryItem itemFound = null;
        for(LibraryItem item: this.LibraryItem){
            if(item.getTitle().equals(title)){
                itemFound = item;
                break;
            }
        }
        if(itemFound == null){
            System.out.println("Item no encotrado");
        }
        if(itemFound.isEstado()){
            userFound.addItem(itemFound);
            itemFound.setEstado(false);
            System.out.println("Item prestado");
        }

    }
}
