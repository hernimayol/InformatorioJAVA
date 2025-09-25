public class ArreglosBidimensionales {

    public static void main(String[] args) {
        int[][] array1 = {
            {1,2,3},
            {4,5}
        };

        char[][] array2 = {
            {'a',},
            {'x','y','z'}
        };

        //Accediendo a la primera fila y la 3er columna
        System.out.println(array1[0][2]);

        for(int i = 0; i < array1.length; i++){ //Primer bucle for para recorrer filas
            for (int j = 0; j < array1.length; j++){ //Segundo bucle for para recorrer columnas
                array1[i][j] = 10; //Asignacion en matrices
                System.out.println("Fila "+i+" columna "+j);
                System.out.println("Elemento ["+array1[i][j] + "]");
            }
        }

        for (int i=array2.length-1;i>=0;i--){
            for(int j= 0; j < array2[i].length; j--){
                array2[i][j] = 10;
                System.out.print("fila"+i+" columna "+j);
                System.out.println("Elemento ["+array2[i][j] + "]");
            }
        }

    }
}
