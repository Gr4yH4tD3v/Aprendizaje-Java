import javax.swing.*;

public class ConversionStringEntero {
    public static void main(String[] args) {
        //Conversion de String a Entero

        //Definimos variables de distintos tipos
        byte numeroByte = 0;
        int numeroInt = 0;
        short numeroShort = 0;
        long numeroLong = 0;

        String numeroStr = JOptionPane.showInputDialog("Ingresa un numero:");
        //Try catch captura los errores
        try {
            //Intentara convertir de String a byte
            numeroByte = Byte.parseByte(numeroStr);
            //Intentara convertir de String a int
            numeroInt = Integer.parseInt(numeroStr);
            //Intentara convertir de String a short
            numeroShort = Short.parseShort(numeroStr);
            //Intentara convertir de String a long
            numeroLong = Long.parseLong(numeroStr);

        } catch (NumberFormatException e) {
            //Si el usuario escribe algo que no sea un entero se ejecuta el Exception
            JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero");

            //Retorna al main para repetir
            main(args);
            //Se sale del catch
            System.exit(0);
        }

        //Se guardan todos los resultados en esta variable
        String resultado = "El String es: " + numeroStr;
        resultado += "\n" + "Conversion a byte: " + numeroByte;
        resultado += "\n" + "Conversion a int: " + numeroInt;
        resultado += "\n" + "Conversion a short: " + numeroShort;
        resultado += "\n" + "Conversion a byte es: " + numeroLong;
        resultado += "\n\n"  + "Si todo se imprime la conversion fue exitosa";

        //Se imprime la variable que contiene los resultados ordenados
        JOptionPane.showMessageDialog(null, resultado);
    }
}

/* ¿Qué hace este programa?
 *  Sabemos que un String no puede guardar números, pero si un texto de un número,
 * ni los de tipo numérico pueden guardar texto
 * Por lo tanto en este experimento hacemos conversiones de diferentes tipos de datos
 * Como el byte - int - short - long

 * - Lo que hago es que defino variables de los tipos de dato que voy a ocupar
 * - Luego le pido al usuario que ingrese un entero

 * - Con un try catch me aseguro que el usuario va a introducir un número en caso de que no
 * Salta el Exception indicándole al usuario que debe ingresar un entero y no otro carácter
 * o algo que no deba estar
 * - En el try hago las conversiones:

 * - Byte.parseByte(numeroStr): Hago la conversion a byte
 * - Integer.parseInt(numeroStr): Hago la conversion a int
 * - Short.parseShort(numeroStr): Hago la conversion a short
 * - Long.parseLong(numeroStr): Hago la conversion a long

 * - Para luego ordenarlos y guardarlos en una variable
 * - Y finalmente imprimir en una ventana emergente*/