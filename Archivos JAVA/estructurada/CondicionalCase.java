public class CondicionalCase {
    public static void main(String[] args) {
        
        /*
         * switch(value){
         * case}
         */
        String curso = "Python";
        final String MENSAJE_BIENVENIDA = "Bienvenidos al curso de ";
        final String CURSO_DE_PYTHON = "Java";
        final var CURSO_DE_JAVA = "Java";
        final String CURSO_DE_TESTING = "Testing";

        switch (curso){
            case "Python":
                System.out.println(MENSAJE_BIENVENIDA + " "+ CURSO_DE_PYTHON);
                break;
            case "Java":
                System.out.println(MENSAJE_BIENVENIDA +" "+CURSO_DE_JAVA);
                break;
            case "Testing":
                System.out.println(MENSAJE_BIENVENIDA +" "+CURSO_DE_TESTING);
                break;
            default:
                System.out.println("Valor por default");
                break;
        }
        System.out.println("Continuamos por aca!!");
    }
}
