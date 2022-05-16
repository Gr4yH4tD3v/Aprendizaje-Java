package Practicas;//Libraries

import java.util.InputMismatchException;
//La clase Scanner permite capturar information del usuario
import java.util.Scanner;

public class SistemasNumericosTerminal {
    //Metody main
    public static void main(String[] args) {
        //Creamos objeto de tipo Scanner
        Scanner scanner = new Scanner(System.in);

        //Se imprime un texto
        System.out.print("Ingrese un número entero: ");
        //Se define una variable
        int numeroEntero = 0;

        //Try catch capturan errores
        try {
            //Intentara pedir un dato entero al usuario
            numeroEntero = scanner.nextInt();

        } catch (InputMismatchException e) {
            //Si el usuario ingresa un numero que no sea entero se ejecuta el catch
            System.out.println("Error debe ingresar un número entero");
            //Retorna al main
            main(args);
            //Sale del catch
            System.exit(0);
        }
        //Imprime el valor de la variable
        System.out.println("numeroDecimal = " + numeroEntero);

        //Conversion de numero Entero a Binario
        String resultadoBinario = "numero binario de " + numeroEntero + " = " + Integer.toBinaryString(numeroEntero);

        //Conversion de numero Entero a Octal
        String resultadoOctal = "numeroOctal de " + numeroEntero + " = " + Integer.toOctalString(numeroEntero);

        //Conversion de numero Entero a Hexadecimal
        String resultadoHex = "numero hexadecimal de " + numeroEntero + " = " + Integer.toHexString(numeroEntero);


        //Concatena las variables de las conversiones dentro de una variable
        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        //Imprime una variable en donde están todas las conversiones
        System.out.println(mensaje);
    }
}

/* ¿Qué es lo que hicimos aquí?
 * Prácticamente es un programa que transforma un número entero
 * proporcionado por el usuario A binario - Octal - Hexadecimal
 * Y mostrándolo en el terminal
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

 * Finalmente mostramos los datos en el terminal*/

