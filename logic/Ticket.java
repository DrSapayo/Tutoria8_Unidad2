package logic;

import models.Asiento;
import models.Cliente;
import exceptions.*;

public class Ticket {

    private int numeroTicket = 0;
    private double precio;
    private Cliente comprador;
    private Asiento asientoAsignado;

    public Ticket(int numeroTicket, double precio){

        this.numeroTicket = numeroTicket;
        this.precio = precio;

    }

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public void asignarTicket(Cliente c){

        numeroTicket++;

        this.comprador = c;

    }

    public void comprarTicket(Cliente c, Asiento a) throws AsientoError {

        if(a.isEstaOcupado()){
            throw new AsientoError("El asiento "+a.getNumero()+ " ya esta asignado");
        }

        this.comprador = c;
        this.asientoAsignado = a;
        a.setEstaOcupado(true);

        System.out.println("El asiento "+a.getNumero()+" ha sido asignado a "+c.getNombre());

    }

    
    public String toString(){
        return "comprador"+ comprador.getNombre()+ "con el ticket numero= "+numeroTicket;
    }

}
