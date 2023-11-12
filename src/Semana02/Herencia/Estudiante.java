package Semana02.Herencia;

public class Estudiante extends Persona {
    private float promedio;

    public Estudiante(String nombre, String apellido, float promedio) {
        super(nombre, apellido);
        System.out.println("Ejecuta constructor3");
        this.promedio = promedio;
    }
}