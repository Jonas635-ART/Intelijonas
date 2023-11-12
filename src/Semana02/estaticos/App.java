package Semana02.estaticos;

import Semana02.SistemaCine.modelos.Usuario;

public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.sumar(1,4);


        usuario user1 = new usuario("Lonela","Mikar");
        System.out.println(usuario.count);
    }
}
