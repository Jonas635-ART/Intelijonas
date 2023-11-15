package Semana02.SistemaCine.core;

import Semana02.SistemaCine.modelos.CinemaItem;
import Semana02.SistemaCine.modelos.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    private List<CinemaItem> cinemaItems;
    private List<Usuario> userLists;

    public Cinema(String name) {
        this.name = name;
        this.cinemaItems = new ArrayList<>();
        this.userLists = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CinemaItem> getCinemaItems() {
        return cinemaItems;
    }

    public void setCinemaItems(List<CinemaItem> cinemaItems) {
        this.cinemaItems = cinemaItems;
    }

    public List<Usuario> getUserLists() {
        return userLists;
    }

    public void setUserLists(List<Usuario> userLists) {
        this.userLists = userLists;
    }
    public void showItems(){
        for(CinemaItem cinema: this.cinemaItems){
            cinema.showinfo();
            System.out.println("-----------");
        }
    }
    public void showItems2(){
        for(CinemaItem cinema: this.cinemaItems){
            cinema.showinfo();
            System.out.println("-----------");
        }
    }
    public void registro(String name, String title){
        Usuario userFound = null;
        for(Usuario user: this.userLists){
            if(user.getName().equals(name)){
                userFound = user;
                break;
            }
        }
        if(userFound == null){
            System.out.println("Usuario no existe");
            return;
        }
        CinemaItem cinemaFound = null;
        for(CinemaItem cinema: this.cinemaItems){
            if(cinema.getTitle().equals(title)){
                cinemaFound = cinema;
                break;
            }
        }
        if(cinemaFound==null){
            System.out.println("Pelicula no existe");
            return;
            
        }
        if(cinemaFound.isEstado()){
            userFound.addItem(cinemaFound);
            cinemaFound.setEstado(false);
            System.out.println("Registro correcto");
        }
        else{
            System.out.println("Error");
        }

        
    }


}
