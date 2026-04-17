package logic;

import model.Asiento;
import java.util.ArrayList;
import java.util.List;

public class Sala {

    private Asiento[] asientos;

    public Sala(int capacidad){
        this.asientos = new Asiento[capacidad];
    }

    public void agregarAsiento(){

        for(int i=0; i < asientos.length; i++){

            asientos[i] = new Asiento(i);
            System.out.println("Asiento "+(i+1));

        }

    }

}
