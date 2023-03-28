public class EjemploValoresVariables {
    public static void main(String[] args) {
        int numero1=5;
        int numero2=10;

        System.out.println(numero2);
        numero2=numero1;
        System.out.println(numero2);
        numero1 = 20;
        System.out.println(numero2); // no cambia porque numero2 no es una copia de numero1
        //java no usa punteros, usa referencias

        
    }
}
