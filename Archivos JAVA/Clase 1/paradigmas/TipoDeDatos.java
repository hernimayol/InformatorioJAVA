package paradigmas;

public class TipoDeDatos{
    public static void main(String[] args){



        //Entero - byte
        /*
         *  MIN_VALUE = -128;
            MAX_VALUE= 127;
         */
        byte valueByte = 127;

        /*
        *MIN_VALUE = -32768;
        MAX_VALUE = 32767;
         */
        short valueShort = 2555; 

        /*
        *MIN_VALUE = -2147483648;
        MAX_VALUE = 2147483647;
         */
        int valueInt = 100;

        /*
        *MIN_VALUE = -128;
        MAX_VALUE = 127;
         */
        long valueLong =200 ;

        System.out.println("El valor para byte es : " + valueByte);
        System.out.println("El valor para short es : " + valueShort);
        System.out.println("El valor para int es : " + valueInt);
        System.out.println("El valor para long es : " + valueLong);

        //Reales

        float valueFloat;
        valueFloat = 2.5f;

        double valueDouble;
        valueDouble = 31.555;
        System.out.println("El valor para float es : " + valueFloat);
        System.out.println("El valor para double es : " + valueDouble);


        //Booleano - True or False - Verdadero o falso 
        boolean valorTrue,valorFalse = false;
        valorTrue = true;

        System.out.println("El valor para la variable verdadera es : " + valueTrue);
        System.out.println("El valor para la variable falsa es : " + valueFalse);

        //Char
        Char valueChar = 'a';
        System.out.println("El valor para char es : " + valueChar);


    }
}