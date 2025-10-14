package principios.abstraccion;

//Las clases abstractas no se instancian, son ideas/conceptos
public abstract class Animal {
    protected String nombre;
    protected int cantidadDePatas;
    protected boolean esDomestico;

    public Animal(String nombre, int cantidadDePatas, boolean esDomestico){}

    public abstract void emitirSonido(); //Metodos que no se implementan, sirve como comportamiento en los cuales sus hijos deben implementar

    public void dormir(){
        System.out.println("Animal durmiendo "+nombre);
    }
}
