package Semana02.SistemaCine.modelos;
import java.util.ArrayList;
import java.util.List;
public class Usuario {
    private String name;
    private int ID;
    private List<CinemaItem> CinemaItemList;

    public Usuario(String name, int ID) {
        this.name = name;
        this.ID = ID;
        this.CinemaItemList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<CinemaItem> getCinemaItemList() {
        return CinemaItemList;
    }

    public void setCinemaItemList(List<CinemaItem> cinemaItemList) {
        CinemaItemList = cinemaItemList;
    }

    public void addItem(CinemaItem item){
        this.CinemaItemList.add(item);
    }
}
