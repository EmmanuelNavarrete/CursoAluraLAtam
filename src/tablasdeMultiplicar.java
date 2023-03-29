public class tablasdeMultiplicar {
    public static void main(String[] args) {

        for (int multiplicacion = 0; multiplicacion <= 10; multiplicacion++) {
            System.out.println("Tabla del " + multiplicacion);

            System.out.println("");
            for (int contador = 0; contador <= 10; contador++) {

                System.out.println(multiplicacion + " * " + contador + " = " + multiplicacion * contador);
                System.out.println("");
            }
        }
    }
}
