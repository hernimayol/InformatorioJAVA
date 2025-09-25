public class ArreglosUnidimensionales{

    public static void main(String[] args) {

        int[] array1= {1,2,3,4,5,6,7}; //Una dimension
        //Operador New
        int[] array2 = new int[7]; //7 elementos

        System.out.println("El tamano del arreglo 1 : " + array1.length);
        System.out.println("Ultimo elemento del arreglo 1 : " + array1[6]);
        System.out.println("Ultimo elemento del arreglo 1 : " + array1[array1.length - 1]);

        // Accedemos al array 2
        System.out.println("Accediendo al elemento 1 del arreglo 1: " + array2[0]);
        System.out.println(array2);

        //El bucle for para reconocer el arreglo
        for (int i = 0; i < array1.length; i++){
            System.out.println("Elemento numero: " + array1[i] + " Para la posicion : " + i );
//continuar...
        }

    
    }

}