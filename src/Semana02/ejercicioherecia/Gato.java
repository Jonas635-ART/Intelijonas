package Semana02.ejercicioherecia;

public class Gato extends Animal {
    protected String color_de_ojo;

    public Gato(byte patas, String raza, byte edad, String color_de_ojo) {
        super(patas, raza, edad);
        this.color_de_ojo = color_de_ojo;
    }
}

