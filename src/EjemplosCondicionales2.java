
public class EjemplosCondicionales2 {
    public static void main(String[] args) {
        
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
