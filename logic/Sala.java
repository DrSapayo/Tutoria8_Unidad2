package logic;

import models.Asiento;
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
        }
    }

    public Asiento getAsiento(int numero){

        return asientos[numero];

    }


    /*public void agregarAsiento() {
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] == null) {
                asientos[i] = new Asiento(i);
                System.out.println("Asiento " + (i + 1) + " agregado");
            } else {
                System.out.println("La sala está llena");
                break;
            }
        }
    }


    /*public boolean verificarAsiento(Asiento asiento){

        if (asiento == null){
            return false;
        }
        
        for (int i = 0; i < asientos.length; i++){
            if (asientos[i] != null && asientos[i].equals(asiento)){
                return true;
            }
        }
        return false;
    }*/
    


    /*public void ocuparAsiento(int numero){
        if(numero < 1 || numero > asientos.length){
            System.out.println("El asiento " + numero + " no existe");
        }else if (asientos[numero - 1]!= null){
            System.out.println("El asiento "+ numero + "ya esta ocupado");
        }else{
            asientos[numero - 1] = new Asiento(numero);
            System.out.println("Asiento "+ numero + "asiento asignado");
        }
    }*/

}
