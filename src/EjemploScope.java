public class EjemploScope {
    public static void main(String[] args) {

        // Scope: es el alcance de una variable
        // Scope: es el lugar donde una variable puede ser usada
        // Scope: es el lugar donde una variable puede ser leida
        // Scope: es el lugar donde una variable puede ser modificada
        //Scope es el alcanze de una variable y se puede definir como el lugar donde una variable puede ser usada, leida o modificada.

        int edad = 21;
        int cantidadPersonas = 2;

        boolean esPareja = cantidadPersonas > 1;
        boolean puedeEntrar = edad >= 18 && esPareja;

        //System.out.println("Es pareja: " + esPareja);
        
        if (puedeEntrar) {
            System.out.println("Usted puede entrar por que cumpe con las condiciones");
            System.out.println("Bienvenido");
        }
        else {
            System.out.println("Usted no puede entrar");    
        }
    }
}
