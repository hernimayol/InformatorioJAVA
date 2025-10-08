public class ArreglosUnidimensionales{

    public static void main(String[] args) {

        int[] array1= {1,2,3,4,5,6,7}; //Una dimension
        //Operador New
        boolean[] array2 = new boolean[7]; //7 elementos

        //Atributo length tiene el tamaño del arreglo
        System.out.println("El tamano del arreglo 1 : " + array1.length);
        System.out.println("Ultimo elemento del arreglo 1 : " + array1[6]);
        System.out.println("Ultimo elemento del arreglo 1 : " + array1[array1.length - 1]);

        // Accedemos al array 2
        System.out.println("Accediendo al elemento 1 del arreglo 1: " + array2[0]);
        System.out.println(array2);

        //El bucle for para reconocer el arreglo
        for (int i = 0; i < array2.length; i++){
            System.out.println("Elemento numero: " + array2[i] + " Para la posicion : " + i );
//continuar...
        }

        for (int i = 0; i < array1.length; i = i + 2 ){
            System.out.println(i);
            System.out.println("Elemento : "+ array1[i]);
        }


        //Asignar valores
        array2[0] = true;
        System.out.println("Valor nuevo asignado "+ array2[0]);

        //Cambiar valores
        array1[1] = array1[1] + 10;
        System.out.println("Nuevo valor en array1 " + array1[1]);

    
    }

}