public class TiposDeDatos {
    public static void main(String[] args){
        //Entero
        /* Byte
         * MIN_VALUE = -128;
         * MAX_VALUE = 127;
         */
        byte valueByte = 127;

        //Short
        /*
         * MIN_VALUE = -32768;
         * MAX_VALUE = 327667;
         */
        short valueShort = 2555;

        /* INT
         * MIN_VALUE = -2.147.483.648;
         * MAX_VALUE = 2.147.483.647;
         */
        int valueInt = 100;

        /* Long
         * MIN_VALUE = -128;
         * MAX_VALUE = 127;
         */
        long valueLong = 200;

        System.out.println("El valor para byte es : " + valueByte);
        System.out.println("El valor para short es : " + valueShort);
        System.out.println("El valor para int es : " + valueInt);
        System.out.println("El valor para long es : " + valueLong);


        // Reales

        float valueFloat;
        valueFloat = 2.5f;

        double valueDouble;
        valueDouble = 31.5;

        System.out.println("El valor para float es : " + valueFloat);
        System.out.println("El valor para double es : " + valueDouble);

        //Booleano - True o False - Verdadero o Falso
        boolean valueTrue, valueFalse = false;
        valueTrue = true;

        System.out.println("El valor para variable verdadera es : " + valueTrue);
        System.out.println("El valor para variable falsa es : " + valueFalse);


        //CHAR
        char valueChar = 'a';

        System.out.println("El valor para Char es : " + valueChar);

    }
}
