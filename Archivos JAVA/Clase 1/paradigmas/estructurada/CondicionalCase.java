public class CondicionalCase {
    public static void main(String[] args) {
        
        /*
         * switch(value){
         * case}
         */
        String Curso = "Python";
        final String MENSAJE_BIENVENIDA = "Bienvenidos al curso de ";
        final String CURSO_DE_PYTHON = "Python";
        final String CURSO_DE_JAVA = "Java";
        final String CURSO_DE_TESTING = "Testing";

        switch (CURSO_DE_TESTING){
            case "Python":
                System.out.println(MENSAJE_BIENVENIDA + " "+ CURSO_DE_PYTHON);
                break;
            case "Java":
                System.out.println(MENSAJE_BIENVENIDA +" "+CURSO_DE_JAVA);
                break;
            case "Testing":
                System.out.println(MENSAJE_BIENVENIDA +" "+CURSO_DE_TESTING);
            default:
                System.out.println("Valor por default");
        }
        System.out.println("Continuamos por aca!!");
    }
}
