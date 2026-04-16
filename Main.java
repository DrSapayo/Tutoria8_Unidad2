import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Pancho", false);
        Cliente c2 = new Cliente("Ana", true);
        Cliente c3 = new Cliente("nodefinido", false);

        Ticket t1 = new Ticket(1, 10000);
        Ticket t2 = new Ticket(2, 10000);
        Ticket t3 = new Ticket(3, 10000);

        t1.asignarTicket(c1);
        t2.asignarTicket(c2);
        t3.asignarTicket(c3);

        Pelicula p1 = new Pelicula("Rapidos y Furiosos", 1.00);
        Pelicula p2 = new Pelicula("Interestellar", 2.30);
        Pelicula p3 = new Pelicula("Madacascar", 1.30);


        List<Pelicula> peliculas = new ArrayList<>();

        peliculas.add(p1);
        peliculas.add(p2);
        peliculas.add(p3);

        Cartelera a1 = new Cartelera(Mes.ABRIL, peliculas);

        Sala vip = new Sala(5);

        vip.agregarAsiento();
        a1.mostrarCartelera();
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        
    }
}
