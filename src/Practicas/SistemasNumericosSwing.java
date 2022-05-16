package Practicas;

import javax.swing.*;

public class SistemasNumericosSwing {

    public static void main(String[] args) {

        //Definimos una variable y guardamos una pantalla emergente
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");

        //Definimos e inicializamos variable
        int numeroEntero = 0;

        //Try catch captura los errores
        try {
            //Pasamos de String a entero y asignamos a la variable
            numeroEntero = Integer.parseInt(numeroStr);

        } catch (NumberFormatException e) {
            //Si el usuario escribe algo que no sea un entero se ejecuta el Exception
            JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero");

            //Retorna al main para repetir
            main(args);
            //Se sale del catch
            System.exit(0);
        }

        //Conversion de entero a binario y guardamos en variable
        String resultadoBinario = "Numero Binario de " + numeroEntero + " = " + Integer.toBinaryString(numeroEntero);

        //Conversion de un entero a octal y guardamos en variable
        String resultadoOctal = "Numero Octal de " + numeroEntero + " = " + Integer.toOctalString(numeroEntero);

        //Conversion de entero a hexadecimal
        String resultadoHex = "Numero Hexadecimal de " + numeroEntero + " = " + Integer.toHexString(numeroEntero);

        //Se muestran los resultados en una ventana emergente
        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;
        JOptionPane.showMessageDialog(null, mensaje);
    }

}

/* ¿Qué es lo que hicimos aquí?
 * Prácticamente es un programa que transforma un número entero
 * proporcionado por el usuario A binario - Octal - Hexadecimal
 * Y mostrándolo en una ventana emergente
 */

/* La lógica es bastante simple, lo primero que hacemos es:
 * - Pedirle al usuario que ingrese un número entero
 * - Recordemos que la variable es de tipo String por eso hay que pasarla a entero
 * - El try va a intentar convertir el String a entero
 * Pero debemos asegurarnos de que se ingrese lo que pedimos para evitar que el programa se rompa
 * - Por eso debemos capturar el error con un catch y redirigirlo al inicio y que vuelva a pedir datos

 * Una vez tengamos el entero con los métodos de la clase Integer:
 * Usamos toBinaryString: Para convertir de Entero a Binario
 * Usamos toOctalString: Para convertir de Entero a Octal
 * Usamos toHexString: Para convertir de Entero a Hexadecimal

 * Finalmente mostramos los datos en una ventana emergente*/