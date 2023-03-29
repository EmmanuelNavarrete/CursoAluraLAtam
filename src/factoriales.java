public class factoriales {
    public static void main(String[] args) {
        //factoriales del 1 al 10
        for (int contador = 1; contador <= 10; contador++) {
            int factorial = 1;
            for (int multiplicacion = 1; multiplicacion <= contador; multiplicacion++) {
                factorial = factorial * multiplicacion;
            }
            System.out.println("El factorial de " + contador + " es " + factorial);
        }
    }
}
