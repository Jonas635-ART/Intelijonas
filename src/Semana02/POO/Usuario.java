package Semana02.POO;

import Semana02.POO.Perfil;

// clases, atributos y metodos
public class Usuario {
    //atributos
    private String username;
    private byte edad;
    private String password;
    private Perfil perfil;


    //metodos
    //el void no devuelve nada
    // constructor📥
    public Usuario(String username, String password, byte edad, Perfil perfil){
        this.username =username;
        this.password =password;
        this.edad =edad;
        this.perfil = perfil;

    }
    public Usuario(String username, String password, byte edad){
        this.username =username;
        this.password =password;
        this.edad =edad;


    }
    public void hablar(String user2){
        System.out.println("Hola: " + user2 + ", soy" + this.username);
    }
    //Getters
    //toma un atributo y lo devuelve una copia
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public Byte getEdad(){
        return this.edad;
    }
    public void setUsername(String username){
        this.username = username;
    }
}
