package Semana02.SistemaCine.modelos;

public class Movie extends CinemaItem {
    private String director;
    private short duration;
    private int age_Rating;

    public Movie(String title, int ID, boolean estado, String director, short duration, int age_Rating) {
        super(title, ID, estado);
        this.director = director;
        this.duration = duration;
        this.age_Rating = age_Rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public short getDuration() {
        return duration;
    }

    public void setDuration(short duration) {
        this.duration = duration;
    }

    public int getAge_Rating() {
        return age_Rating;
    }

    public void setAge_Rating(int age_Rating) {
        this.age_Rating = age_Rating;
    }
}
