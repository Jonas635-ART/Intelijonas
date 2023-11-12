package Semana02.ClasesAbstractas;

public class Cuadrado extends Figura {
    private float lado;


    public Cuadrado(String color, boolean relleno, float lado) {
        super(color, relleno);
        this.lado = lado;
    }

    @Override
    public float area() {
        return this.lado*this.lado;
    }
    @Override
    public float perimetro() {
        return this.lado;
    }
}
