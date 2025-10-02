public class CodeChadsAcademy {
    public static void main(String[] args) {
        
        // Ejemplo de 4 alumnos, cada uno con 5 notas
        String[] alumnos = {"Ana","Bruno","Carla","Diego"};
        int[][] notas = {
            {50,80,60,0,0}, //Ana
            {40,55,55,0,0}, //Bruno
            {60,70,80,0,0},  //Carla
            {30,20,40,0,0}, //Diego
        };

        // =========1ra Parte: calcular nota 4 y 5 ===========
        for(int i = 0; i < alumnos.length; i++){
            //Nota 4, depende de nota 2
            if (notas[i][1] < 60){
                notas[i][3] = 100;
            }else {
                notas[i][3] = notas[i][1];
            }

            //Nota 5 depende de nota 1 + nota3
            if (notas[i][0] + notas [i][2] > 150){
                notas[i][4] = 95;
            }else{
                notas[i][4] = 70;
            }
        }

        //Mostrar todas las notas
        System.out.println("*** Notas de los alumnos ***");
        for (int i = 0; i < alumnos.length; i++){
            System.out.println("\nAlumno: "+ alumnos[i]);

            // 1. Verificar aprobacion
            int aprobadas = 0;
            int total = 0;
            for( int j = 0; j < 5; j++){
                if (notas[i][j] >= 60) aprobadas++;
                total += notas[i][j];
            }
            if (aprobadas == 5){
                System.out.println("Resultado: Aprobaste todas. ¡Backend Sensei");
            }else if(aprobadas == 0){
                System.out.println("Resultado: No aprobaste ninguna. ¡Sos un clon de Frontend xd!");
            }else{
                System.out.println("Resultado: Algunas aprobadas. Sos un refactor en progreso.");
            }

            // 2. Prueba mas inconsistente
            int mayorSalto = 0, desde = 0;
            for (int j = 0; j < 4; j++){
                int salto = Math.abs(notas[i][j+1] - notas[i][j]);
                if ( salto > mayorSalto){
                    mayorSalto = salto;
                    desde = j;
                }
            }
            System.out.println("Mayor salto: "+mayorSalto+" puntos entre prueba "+ (desde+1)+" y "+(desde+2));

            //3. Bonus progresivo
            boolean progresivo = true;
            for(int j = 1; j < 5; j++){
                if (notas[i][j] <= notas[i][j-1]){
                    progresivo = false;
                    break;
                }
            }
            if(progresivo){
                System.out.println("¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈");

            }
            // 4. Ordenar notas (burbuja descendente)
            int[] copia = notas[i].clone();
            for(int a = 0; a < copia.length - 1; a++){
                for( int b = 0; b < copia.length -1 - a; b++){
                    if (copia[b] < copia[b+1]){
                        int tmp = copia[b];
                        copia[b] = copia[b+1];
                        copia[b+1] = tmp;
                    }
                }
            }
            System.out.println("Notas ordenadas: ");
            for (int n = 0; n < copia.length; n++){
                System.out.println(copia[n]+(n<copia.length -1 ? ", " : " "));
            }
            System.out.println();

            //5. Evaluacion por nivel
            if(total < 250){
                System.out.println("Normie total 😢");
            }else if(total <= 349){
                System.out.println("Soft Chad");
            }else if (total <= 449){
                System.out.println("Chad");
            }else{
                System.out.println("Stone Chad definitivo 💪");
            }
        }

        // ========== 3ra parte: Ranking general ============
        //a) Promedio mas alto
        double mejorProm = -1;
        int indxProm = -1;
        for(int i = 0; i < alumnos.length; i++){
            int suma = 0;
            for (int j = 0; j < 5; j++) suma +=notas[i][j];
            double prom = suma / 5.0;
            if (prom > mejorProm){
                mejorProm = prom;
                indxProm = i;
            }
        }
        System.out.println("\nMejor promedio: "+alumnos[indxProm]+" con "+ mejorProm);

        //b) Mas regular (menor diferencia entre max y min)
        int idxReg = -1;
        int mejorRango = Integer.MAX_VALUE;
        for( int i = 0; i < alumnos.length; i++){
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            for(int j = 0; j < 5; j++){
                if(notas[i][j] > max) max = notas[i][j];
                if(notas[i][j] < min) min = notas[i][j];
            }
            int rango = max - min;
            if(rango < mejorRango){
                mejorRango = rango;
                idxReg = i;
            }
        }
        System.out.println("Mas regular: "+alumnos[idxReg]+ " (rango = "+mejorRango+ ")");

        //c) Peor nota en la prueba 3
        int peorIdx = -1;
        int peorNota3 = Integer.MAX_VALUE;
        for (int i=0; i < alumnos.length; i++){
            if(notas[i][2] < peorNota3){
                peorNota3 = notas[i][2];
                peorIdx = i;
            }
        }
        System.out.println("Peor en la prueba 3: "+ alumnos[peorIdx]+" con "+peorNota3);
    }
}
