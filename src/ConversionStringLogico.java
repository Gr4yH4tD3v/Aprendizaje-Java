import javax.swing.*;

public class ConversionStringLogico {
    public static void main(String[] args) {
        //Conversion de String a Logico

        boolean logico1 = false;
        boolean logico2 = false;


        String palabra1 = JOptionPane.showInputDialog("Ingresa true o false \"lógico1\"");
        String palabra2 = JOptionPane.showInputDialog("Ingresa true o false \"lógico2\"");

            //Intentara convertir de String a double
            logico1 = Boolean.parseBoolean(palabra1);
            //Intentara convertir de String a float
            logico2 = Boolean.parseBoolean(palabra2);


        //Se guardan todos los resultados en esta variable
        String resultado = "El String 1 es: " + palabra1;
        resultado += "\n" + "El String 2 es: " + palabra2;
        resultado += "\n" + "Conversion a lógico 1: " + logico1;
        resultado += "\n" + "Conversion a lógico 2: " + logico2;
        resultado += "\n\n"  + "Si lo dejas todo en true notaras el cambio, todo viene false por defecto";

        //Se imprime la variable que contiene los resultados ordenados
        JOptionPane.showMessageDialog(null, resultado);
    }
}

/* ¿Qué hace este programa?
 *  Sabemos que un String no puede guardar números, pero si un texto de un número,
 * ni los de tipo lógico pueden números o alguno texto, a excepción de true o false
 * Por lo tanto en este experimento hacemos conversiones de diferentes tipos de datos
 * Como el boolean
 *
 * - Lo que hago es que defino variables de los tipos de dato que voy a ocupar
 * - Luego le pido al usuario que ingrese true o falso o sea un lógico

 * - Boolean.parseBoolean(numeroStr): Hago la conversion a boolean o lógico

 * - Para luego ordenarlos y guardarlos en una variable
 * - Y finalmente imprimir en una ventana emergente*/

