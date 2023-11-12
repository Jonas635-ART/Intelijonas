package Semana02.SistemaCine.core;

import Semana02.SistemaCine.modelos.CinemaItem;
import Semana02.SistemaCine.modelos.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    private List<CinemaItem> CinemaItem;
    private List<Usuario> UserItem;

    public Cinema(String name) {
        this.name = name;
        this.CinemaItem = new ArrayList<>();
        this.UserItem = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Semana02.SistemaCine.modelos.CinemaItem> getCinemaItem() {
        return CinemaItem;
    }

    public void setCinemaItem(List<Semana02.SistemaCine.modelos.CinemaItem> cinemaItem) {
        CinemaItem = cinemaItem;
    }

    public List<Usuario> getUserItem() {
        return UserItem;
    }

    public void setUserItem(List<Usuario> userItem) {
        UserItem = userItem;
    }
    public void showItems(){
        for(CinemaItem cinema: this.CinemaItem){
            cinema.showinfo();
            System.out.println("-----------");
        }
    }
    public void registro(String name, String title){
        Usuario userfound = null;
        for(Usuario user: this.UserItem){
            if(user.getName().equals(name)){
                userfound = user;
                break;
            }
        }
        if(userfound == null){
            System.out.println("Usuario no existe");
            return;
        }
        CinemaItem cinefound = null;
        for(CinemaItem item: this.CinemaItem){
            if(item.getTitle().equals(title)){
                cinefound = item;
                break;
            }
        }
        if(cinefound == null){
            System.out.println("Pelicula no existe");
            
        }
        if(cinefound.isEstado()){
            userfound.addItem(cinefound);
            cinefound.isEstado(false);
            System.out.println("Registro correcto");
        }
        
    }

}
