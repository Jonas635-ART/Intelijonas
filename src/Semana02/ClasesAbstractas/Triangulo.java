package Semana02.ClasesAbstractas;

public class Triangulo extends Figura {
    private float base ;
    private float alto ;


    public Triangulo(String color, boolean relleno, float base, float alto) {
        super(color, relleno);
        this.base = base;
        this.alto = alto;
    }

    @Override
    public float area() {
        return base*alto/2;
    }

    @Override
    public float perimetro() {
        return 0;
    }
}
