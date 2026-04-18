package models;

public class Asiento {

    private int numero;
    private boolean estaOcupado;

    public Asiento(int numero){
        this.numero = numero;
        this.estaOcupado = false;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(){
        this.numero = numero;
    }

    public boolean isEstaOcupado(){
        return estaOcupado;
    }

    public void setEstaOcupado(boolean estado){
        this.estaOcupado = estado;
    }

    public String toString(){
        return "asiento numero= "+numero;
    }
}