import java.util.Scanner;

public class prueba{
    
    public static void main(String[] args){
        // 1. Creamos un objeto Scanner para leer desde la consola
        Scanner sc = new Scanner(System.in);

        // 2. Pedimos el primer número
        System.out.print("Ingrese el primer número: ");
        int numero1 = sc.nextInt();  // lee un entero desde teclado

        // 3. Pedimos el segundo número
        System.out.print("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();

        // 4. Realizamos la suma
        int resultado = numero1 + numero2;

        // 5. Determinamos paridad con operador ternario
        String paridad = (resultado % 2 == 0) ? "par" : "impar";

        // 6. Mostramos el resultado
        System.out.println("El resultado es " + resultado + " y es " + paridad);

        // 7. Cerramos el Scanner (buena práctica)
        sc.close();
    }
}
