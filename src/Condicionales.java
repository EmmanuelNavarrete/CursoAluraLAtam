public class Condicionales {
    public static void main(String[] args) {
        
        int edad = 17;
        int cantidad = 2;

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
            System.out.println("Bienvenido");
        }
        else {
            if (cantidad >= 2){
                System.out.println("usted es menor de edad pero puede entrar con un adulto");
            } else {
                System.out.println("Usted es menor de edad y no puede entrar");
            }
        }
    }

}
