package Semana02.Sistema_biblioteca.Modelos;

public class Book extends LibraryItem{
    private String author;

    public Book(String Title, int ID, boolean estado, String author) {
        super(Title, ID, estado);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public void showinfo(){
        System.out.println("El item tiene estos datos");
        System.out.println("title: " + this.Title);
        System.out.println("title: " + this.ID);
        System.out.println("title: " + this.estado);
        System.out.println("autor:" +this.author);
    }
}
