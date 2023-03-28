public class Conversiones {
    public static void main(String[] args) {
        double variable1 = 230.89;
        //Tenemos en java lo que se llama casting, que es la conversion de un tipo de dato a otro
        //En este caso estamos convirtiendo un double a un int

        int variableEntero = (int) variable1;
        System.out.println("El valor de la variable entero es "+ variableEntero); //Cast
        
        //Ignorará la parte decimal y solo tomará el valor entero
        
        //Hay que tener en cuenta que int solo soporta 2^32 valores, por lo que si el valor es mayor a este, se perderá información
        //long soporta 2^64 valores, por lo que si el valor es mayor a este, se perderá información
        //float soporta 2^32 valores, por lo que si el valor es mayor a este, se perderá información
        //double soporta 2^64 valores, por lo que si el valor es mayor a este, se perderá información

        long prueba = 1234567890123456789L; //L para indicar que es un long
        short numeroPequeno = 12345; //va en el rango de 2^16
        byte numeroAunMasPequeno = 127; //va en el rango de 2^8
        float numeroConDecimales = 123.45f; //f para indicar que es un float


        double resultado = variable1 + variableEntero;
        System.out.println("El resultado de la suma es "+ resultado);

        int resultado2 = (int) (variable1 + variableEntero);
        System.out.println("El resultado de la suma es "+ resultado2);
        

    }
}
