package Semana02.tutorias;

public class profesor extends Persona {
    String titulo;

    public profesor(String nombre, String apellido, String titulo) {
        super(nombre, apellido);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
