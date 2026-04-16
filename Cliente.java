public class Cliente{
    // Atributos

    private String nombre;
    private boolean esSocio = false;

    public Cliente(String nombre, boolean esSocio){
        this.nombre = nombre;
        this.esSocio = esSocio;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void asociar(){

        esSocio = true;

    }

    public String toString(){

        return "Cliente: nombre = "+this.nombre+" es socio? = "+this.esSocio;

    }


}