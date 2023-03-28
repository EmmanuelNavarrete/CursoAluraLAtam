public class Ejercicio {
    public static void main(String[] args) {
        /*
         A Juan le gustaría crear un programa sobre Impuesto sobre la Renta (IR), para ello, 
         verificó las reglas de impuestos. Encontró en el sitio web de impuestos que:

        De 1900.0 a 2800.0, el IR es de 7.5% y puede deducir de la declaración el monto de 142.
        De 2800.01 a 3751.0, el IR es del 15% y puede deducir 350.
        De 3751.01 a 4664.00, el IR es 22.5% y puede deducir 636.
        
        */

        double salario = 3300.0;
        double ir = 0.0;
        double deduccion = 0.0;

        if (salario >= 1900.0 && salario <= 2800.0) {
            ir = salario * 0.075;
            deduccion = 142.0;
           System.out.println("Su tasa de impuesto es de 7.5% y puede deducir de la declaración el monto de 142.");
        }
        else if (salario >= 2800.01 && salario <= 3751.0) {
            ir = salario * 0.15;
            deduccion = 350.0;
            System.out.println("Su tasa de impuesto es de 15% y puede deducir de la declaración el monto de 350.");
        }
        else if (salario >= 3751.01 && salario <= 4664.00) {
            ir = salario * 0.225;
            deduccion = 636.0;
            System.out.println("Su tasa de impuesto es de 22.5% y puede deducir de la declaración el monto de 636.");
        }
        else {
            System.out.println("No se puede calcular el IR");
        }

    }
}
