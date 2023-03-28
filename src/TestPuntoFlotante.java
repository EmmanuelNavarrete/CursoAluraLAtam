public class TestPuntoFlotante {
    public static void main(String[] args) {
        double salario =1250.50;
        //Usa el + para concatenar la variable de salario con un texto:
        System.out.println("El salario es "+ salario);
        // Recuerda que no podemos colocar un valor de tipo flotante dentro de una variable de tipo int, prueba:
        //int valor =12.5;
        //int valor2 = 0.0;
       // double test = 125.50;
        //int valor3 = test;
        int division = 5/2;
        System.out.println("El resultado de la division es "+ division);

         /*
          Es importante tener en cuenta que cuando hacemos una división inexacta, 
          pero estamos dividiendo números enteros, Java siempre truncará el resultado. 
          En este ejemplo, la salida siempre será 2.
          */

        double division2 = 5/2;
        System.out.println("El resultado de la division es "+ division2);

        /*
        En este caso, la división es exacta, por lo que el resultado es 2.5.
        */
        
    }
}
