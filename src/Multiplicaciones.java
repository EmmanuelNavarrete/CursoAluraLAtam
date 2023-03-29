public class Multiplicaciones {
    public static void main(String[] args) {
        for (int contador = 1; contador <= 10; contador++) {
            System.out.println("");
            for (int multiplicacion = 1; multiplicacion <= 10; multiplicacion++) {
                System.out.print(contador * multiplicacion);
                System.out.print(" ");
            }
        }
    }
}