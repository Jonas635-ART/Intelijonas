package Semana02.Herencia;

public class Profesor extends Persona{
    private float salario;

    public Profesor(String nombre, String apellido, float salario) {
        super(nombre, apellido);
        System.out.println("Ejecuta constructor2");
        this.salario = salario;
    }
}
