package Conversiones;

import javax.swing.*;

public class ConversionStringFlotante {
    public static void main(String[] args) {
        //Conversion String a Flotante

        double numeroDouble = 0;
        float numeroFloat= 0;


        String numeroStr = JOptionPane.showInputDialog("Ingresa un numero:");
        //Try catch captura los errores
        try {
            //Intentara convertir de String a double
            numeroDouble = Double.parseDouble(numeroStr);
            //Intentara convertir de String a float
            numeroFloat= Float.parseFloat(numeroStr);


        } catch (NumberFormatException e) {
            //Si el usuario escribe algo que no sea un entero se ejecuta el Exception
            JOptionPane.showMessageDialog(null, "Error debe ingresar un número con decimales");

            //Retorna al main para repetir
            main(args);
            //Se sale del catch
            System.exit(0);
        }

        //Se guardan todos los resultados en esta variable
        String resultado = "El String es: " + numeroStr;
        resultado += "\n" + "Conversion a double: " + numeroDouble;
        resultado += "\n" + "Conversion a float: " + numeroFloat;
        resultado += "\n\n"  + "Si todo se imprime la conversion fue exitosa";

        //Se imprime la variable que contiene los resultados ordenados
        JOptionPane.showMessageDialog(null, resultado);
    }
}

/* ¿Qué hace este programa?
 *  Sabemos que un String no puede guardar números, pero si un texto de un número,
 * ni los de tipo numérico pueden guardar texto
 * Por lo tanto en este experimento hacemos conversiones de diferentes tipos de datos
 * Como el double o float

 * - Lo que hago es que defino variables de los tipos de dato que voy a ocupar
 * - Luego le pido al usuario que ingrese un decimal

 * - Con un try catch me aseguro que el usuario va a introducir un número en caso de que no
 * Salta el Exception indicándole al usuario que debe ingresar un decimal y no otro carácter
 * o algo que no deba estar
 * - En el try hago las conversiones:

 * - Double.parseDouble(numeroStr): Hago la conversion a double
 * - Float.parseFloat(numeroStr): Hago la conversion a float

 * - Para luego ordenarlos y guardarlos en una variable
 * - Y finalmente imprimir en una ventana emergente*/

