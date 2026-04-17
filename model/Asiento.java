public class Asiento {

    private int numero;

    public Asiento(int numero){

        this.numero = numero;

    }

    public int getNumero(){
        return numero;
    }


    public void setNumero(){
        this.numero = numero;
    }

    public String toString(){
        return "asiento numero= "+numero;
    }
}