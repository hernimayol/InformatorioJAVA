package poo;
//public --> Es un modificador de acceso (Clasificador para clase)
//class -> Indicamos que es una clase
//Auto --> Es el nombre de mi clase
public class Auto {

    //Atributos
    private int cantidadDeRuedas;
    private boolean esElectrico = false;
    private String marca;
    private String modelo;
    private String color;


    //Constructores
    public Auto(){} //Constructor
    public Auto(int cantidadDeRuedas, boolean esElectrico, String marca, String color){
        this.cantidadDeRuedas = cantidadDeRuedas;
        this.esElectrico = esElectrico;
        this.marca = marca;
        this.color = color;
    }




    //Setters - Guardamos informacion
    //public --> Es un modificador de acceso (Clasificador para metodo)
    //void --> Tipo de retorno en este caso no devuelve nada
    //setCantidadDeRuedas --> nombre del metodo
    // () --> Los parametros del metodo


    public void setCantidadDeRuedas(int cantidadDeRuedas) {
        //this apunta la clase a si mismo
        this.cantidadDeRuedas = cantidadDeRuedas;

    }

    public void setEsElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Getters - Devolvemos informacion (da info)

    public int getCantidadDeRuedas() {
        return this.cantidadDeRuedas; // return --> Devuelve 'algo' en el metodo

    }

    public boolean getEsElectrico() {
        return esElectrico;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
