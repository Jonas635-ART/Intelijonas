package Semana02.Sistema_biblioteca.Modelos;

public class LibraryItem {
    protected String Title;
    protected int ID;
    protected boolean estado;

    public LibraryItem(String Title, int ID, boolean estado) {
        this.Title = Title;
        this.ID = ID;
        this.estado = estado;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
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
        System.out.println("title: " + this.Title);
        System.out.println("title: " + this.ID);
        System.out.println("title: " + this.estado);

    }
}
