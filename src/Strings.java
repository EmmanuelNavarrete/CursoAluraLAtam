public class Strings {
    public static void main(String[] args) {
        //
        char caracter = 'a'; 
        System.out.println("El valor del caracter es "+ caracter);
        caracter = 65; //El valor de la tabla ASCII
        System.out.println("El valor del caracter es "+ caracter);
        caracter = 65 + 1; //El valor de la tabla ASCII
        System.out.println("El valor del caracter es "+ caracter);
        
        char segundoCaracter = (char) (caracter + 1);
        System.out.println("El valor del caracter con concatenacion es "+ segundoCaracter);

        //String es una clase, por lo que se debe instanciar
        // Esto es una cadena de caracteres
        String palabra = "Curso de alura LAtam";
        System.out.println(palabra);
        palabra = palabra + " 2021";
        System.out.println(palabra);
        



    }
}
