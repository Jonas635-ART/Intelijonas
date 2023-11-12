package Semana02.SistemaCine.modelos;

public class Sala_de_cine extends CinemaItem {
    private int capacity;
    private int Nro_de_sala;
    private boolean is3D;

    public Sala_de_cine(String title, int ID, boolean estado, int capacity, int nro_de_sala, boolean is3D) {
        super(title, ID, estado);
        this.capacity = capacity;
        this.Nro_de_sala = nro_de_sala;
        this.is3D = is3D;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNro_de_sala() {
        return Nro_de_sala;
    }

    public void setNro_de_sala(int nro_de_sala) {
        Nro_de_sala = nro_de_sala;
    }

    public boolean isIs3D() {
        return is3D;
    }

    public void setIs3D(boolean is3D) {
        this.is3D = is3D;
    }
}
