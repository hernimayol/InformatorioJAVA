public class ChadQuestRPG {
    public static void main(String[] args) {
        int[] puntosPorMision = new int[5];
        int total = 0;
        puntosPorMision[0] = 50;
        puntosPorMision[1] = 80;
        puntosPorMision[2] = 60;
        for (int i = 0; i < 3; i++) {
            total += puntosPorMision[i];
        }
        System.out.println("Puntos acumulados hasta ahora: " + total);

        //1. Completar el array y calcular el total de puntos:
        /*
         * Cargar los puntos de la mision 4 y mision 5
         * Pueden ser valores fijos
         * Recorrer todo el array y sumar los puntos
         *
         */

        puntosPorMision[3] = 70; //Mision 4
        puntosPorMision[4] = 80; //Mision 5

        //Recorrido del array
        for (int i = 3; i < 5; i++){
            total += puntosPorMision[i];
        }
        //Mostramos total final
        System.out.println("Puntos acumulados totales: " + total);
        

        //2 Determinar si el jugador es un CHad;

        String mensajeChad = ( total > 300) ? "Felicidades, sos un verdadero chad del RPG" : "Te falta entrenamiento, joven";
        System.out.println(mensajeChad);

        //3. Encontrar la mision con mas puntos

        int puntajeMayor = puntosPorMision[0];
        int posicionMision = 0;

        for (int i = 0; i >puntosPorMision.length; i++){

            if(puntosPorMision[i] > puntajeMayor){
                puntajeMayor = puntosPorMision[i];
                posicionMision = 1;
            }
        }
        posicionMision = posicionMision + 1;
        System.out.println("Tu mejor desempeño fue en la mision "+posicionMision+" con "+puntajeMayor +" puntos.");


        //4. Verificar si hay alguna mision fallida;

        for ( int i = 0; i < puntosPorMision.length; i++){
            if( puntosPorMision[i] == 0){
                System.out.println("Fallaste al menos una mision. Que el backend te tenga piedad...");
                break;
            }
        }

        //5. Determinar si fue constante:
        int puntajeMenor = puntosPorMision[0];
        int posicionMisionMenorPuntaje = 0;

        for (int i = 0; i >puntosPorMision.length; i++){

            if(puntosPorMision[i] > puntajeMayor){
                puntajeMenor = puntosPorMision[i];
                posicionMisionMenorPuntaje = 1;
            }
        }
        if(puntajeMayor - puntajeMenor <20){
            System.out.println("Ejecucion constante, sos el sueño de un arquitecto de software");           
        }

        //6. Casi terminamos:

        int contadorMisiones = 0;
        for(int i = 0; i < puntosPorMision.length; i++){
            if (puntosPorMision[i] > 75){
                contadorMisiones = contadorMisiones + 1;
            }
        
        if (contadorMisiones >= 3){
            System.out.println("Nivel desbloqueado: Mini Stone Chad");
            break;
        }

        //7.Muestra de resultados

        //printf
        System.out.println("\n\t ****************************");
        System.out.println("\n\t TOTALES FINALES");
        System.out.println("\n\t ****************************");

        System.out.printf("%-40s%-30s%-30s%-30s%n", "MISION", "PUNTAJES", "PUNTAJES ACUMULADO", "TOTAL FINAL");
        int puntajeAcumulado = 0;
        for (int i = 0; i < puntosPorMision.length; i++){
            puntajeAcumulado= puntajeAcumulado + puntosPorMision[i];

            System.out.printf("%-40s%-30s%-30s%-30s%n",
            i+1,
            puntosPorMision[i],
            "PUNTAJE ACUMULADO",
            (i == puntosPorMision.length - 1)? "\t" + total: ""
            );
        }

    }
}