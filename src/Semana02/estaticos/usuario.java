package Semana02.estaticos;

public class usuario {
    private String nombre;
    private String apellido;
    public static int count = 0;

    public usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        count++;
    }
}
