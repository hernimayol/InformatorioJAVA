package paradigmas;

public class CondicionalMultiple {
    public static void main(String[] args){
        boolean esUnDiaLluvioso = false;
        final String DIA = "Sabado";

        /*
         * Multiple
         * If(condicion)
         * {//Sentencias}
         * else if (condicion)
         * {//Sentencias}
         * else if (condicion)
         * {//Sentencias}
         * else <-(opcional)
         * {//Sentencias}
         */

        if(esUnDiaLluvioso && DIA == "MARTES"){
            System.out.println("Hoy es: "+ DIA + "Y esta lloviendo");
        }else if(esUnDiaLluvioso == false){
            System.out.println("Hoy es: "+ DIA + "Y no esta lloviendo");

        }else{
            System.out.println("Este es el mensaje por default");
        }
//
//
        if (esUnDiaLluvioso){
            System.out.println("Es un dia de lluvia!!");

            if (DIA == "Lunes" || DIA == "MARTES"){
                System.out.println("Hoy es : "+ DIA + "Te espera un dia lluvioso");
            }else if(DIA == "Miercoles"){
                System.out.println
            }

        }




    }


}
