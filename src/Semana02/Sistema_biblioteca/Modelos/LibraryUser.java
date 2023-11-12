package Semana02.Sistema_biblioteca.Modelos;

import java.util.ArrayList;
import java.util.List;

public class LibraryUser {
    private String username;
    private int usernameID;
    private List<LibraryItem> libraryItemList;

    public LibraryUser(String username, int usernameID) {

        this.username = username;
        this.usernameID = usernameID;
        this.libraryItemList = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUsernameID() {
        return usernameID;
    }

    public void setUsernameID(int usernameID) {
        this.usernameID = usernameID;
    }

    public List<LibraryItem> getLibraryItemList() {
        return LibraryItemList;
    }

    public void setLibraryItemList(List<LibraryItem> libraryItemList) {
        LibraryItemList = libraryItemList;
    }

    private List<LibraryItem> LibraryItemList;


    public void addItem(LibraryItem item){
        this.libraryItemList.add(item);
    }
}
