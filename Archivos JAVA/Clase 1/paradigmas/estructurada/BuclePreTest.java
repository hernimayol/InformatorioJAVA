public class BuclePreTest {
    public static void main(String[] args) {
        /*
         * Pre-test - While
         */
        int condicion = 1;
        while (condicion < 10) {
            System.out.println("Hola soy el numero "+condicion);
            //condicion = condicion + 1;
            condicion++;
            if(condicion == 5){
                break;
            }
        }
    }
}
