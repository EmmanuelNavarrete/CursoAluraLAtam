public class EjemplosCiclos {
    public static void main(String[] args) {
        int contador = 0;
        while (contador+1<=10){ //mientras que
            contador++;
            //hay diferentes maneras de incrementar el contador
            //contador = contador + 1;
            //contador += 1;
            //contador++;
            System.out.println("contador = " + contador);
        }
    }
}
