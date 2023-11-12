package Semana02.Herencia;

public class Persona {
    protected String nombre;
    protected String apellido;

    public Persona(String nombre, String apellido) {
        System.out.println("Ejecuta 1 constructor");
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
