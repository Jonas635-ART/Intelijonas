package Semana02.Sistema_biblioteca.Modelos;

public class DVD extends LibraryItem {
    private String director;
    private short duration;
    public DVD(String Title, int ID, boolean estado, String director, short duration){
        super(Title, ID, estado);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public short getDuration() {
        return duration;
    }

    public void setDuration(short duration) {
        this.duration = duration;
    }
    public void showinfo(){
        System.out.println("EL DVD");
        System.out.println("title: " + this.Title);
        System.out.println("title: " + this.ID);
        System.out.println("title: " + this.estado);
        System.out.println("director: " + this.director);
        System.out.println("duration: " + this.duration);
    }
}
