package poo;

public class App {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setCantidadDeRuedas(4);
        auto.setColor("Verde");
        auto.setMarca("Marca X");
        auto.setModelo("2003");

        //auto.mostrarInformacion();

        System.out.println(auto.getCantidadDeRuedas());
        System.out.println(auto.getColor());
        System.out.println(auto.getMarca());
        System.out.println(auto.getModelo());
        System.out.println(auto.getEsElectrico());

        //Cambiar el estado del atributo color
        auto.setColor("Rojo");
        System.out.println(auto.getColor());


        Auto auto2 = new Auto(4,true,"Marca 1", "Rojo");
        auto2.setModelo("Modelo 1");

        Auto auto3 = new Auto(4,"Marca 1", "Modelo2", "Negro");
        auto3.setModelo("Modelo 2");


    }
}
