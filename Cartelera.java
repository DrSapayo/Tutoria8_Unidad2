import java.util.ArrayList;
import java.util.List;

public class Cartelera{

    // Atributos
    private Mes mes;
    private List<Pelicula> peliculas;
   

    // Constructor
    public Cartelera(Mes mes, List<Pelicula> peliculas){
        this.mes = mes;
        this.peliculas = peliculas;
    }

    public void mostrarCartelera() {

        System.out.println("Las peliculas en cartelera:");

        for(int i=0; i < peliculas.size(); i++){
            System.out.println("-----------"+peliculas.get(i)+"----------");
        }
    }


}