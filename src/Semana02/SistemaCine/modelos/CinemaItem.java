package Semana02.SistemaCine.modelos;

public abstract class CinemaItem {
    protected String title;
    protected int ID;
    protected boolean estado;

    public CinemaItem(String title, int ID, boolean estado) {
        this.title = title;
        this.ID = ID;
        this.estado = estado;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void showinfo(){
        System.out.println("title: " + this.title);
        System.out.println("title: " + this.ID);
        System.out.println("title: " + this.estado);
    }

    public abstract void showItems();
}
