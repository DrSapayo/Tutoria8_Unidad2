public class Ticket {

    private int numeroTicket = 0;
    private double precio;
    private Cliente comprador;

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

    
    public String toString(){
        return "comprador"+ comprador.getNombre()+ "con el ticket numero= "+numeroTicket;
    }

}
