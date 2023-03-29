import java.net.SocketTimeoutException;

public class scopeCiclos {
    public static void main(String[] args) {
        int contador = 0;
        int total = 0;

        while (contador <= 10) { // mientras que
            total = total + contador;
            System.out.println("contador = " + contador);
            contador++;
        }
        System.out.println("El valor de la sumatoria total = " + total);
    }
}
