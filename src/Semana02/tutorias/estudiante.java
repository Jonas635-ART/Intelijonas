package Semana02.tutorias;

public class estudiante extends Persona{
    private float promedio;

    public estudiante(String nombre, String apellido, float promedio) {
        super(nombre, apellido);
        this.promedio = promedio;
    }
    public void hacertarea{
        System.out.println("El estudiante y su atrea");
    }
    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
}
