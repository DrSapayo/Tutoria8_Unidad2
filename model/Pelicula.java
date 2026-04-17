import java.util.ArrayList;

public class Pelicula {

    private String titulo;
    private double duracion;

    public Pelicula(String titulo, double duracion){

        this.titulo = titulo;
        this.duracion = duracion;

    }

    public String getTitulo(){
        return titulo;
    }

    public double getDuracion(){
        return duracion;
    }
    
    public void setTitulo(){
        this.titulo = titulo;
    }

    public void setDuracion(){
        this.duracion = duracion;
    }

    public String toString(){
        return "Pelicula: titulo = "+titulo+" duracion = "+duracion;
    }

}
