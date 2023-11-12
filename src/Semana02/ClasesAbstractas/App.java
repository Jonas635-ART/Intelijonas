package Semana02.ClasesAbstractas;

public class App {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo("azul",true,8f,16f);
        System.out.println("El area del triangulo es: " + triangulo1.area());
    }
}
