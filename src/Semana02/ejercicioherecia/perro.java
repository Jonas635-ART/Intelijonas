package Semana02.ejercicioherecia;

public class perro extends Animal{
    protected String nombre;

    public perro(byte patas, String raza, byte edad, String nombre) {
        super(patas, raza, edad);
        this.nombre = nombre;
    }
}

