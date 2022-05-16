package Conversiones;
//Importamos librerías
import javax.swing.*;
import java.util.Scanner;

public class ConversionPrimitvoString {
    public static void main(String[] args) {
        //Conversion Primitivo a String

        //Creamos un objeto Scanner, sirve para capturar datos del usuario
        Scanner entrada = new Scanner(System.in);

        //Definimos variables
        byte numeroByte = 0;
        short numeroShort = 0;
        int numeroInt = 0;
        long numeroLong = 0;

        //Capturamos datos del usuario
        System.out.print("Ingrese un numero para byte: ");
        numeroByte = entrada.nextByte();
        System.out.print("Ingrese un numero para short: ");
        numeroShort = entrada.nextShort();
        System.out.print("Ingrese un numero para int: ");
        numeroInt = entrada.nextInt();
        System.out.print("Ingrese un numero para long: ");
        numeroLong = entrada.nextLong();

        //Sumamos los enteros, como todos son enteros numéricos hice casting o forzar la suma
        int sumaEnteros = (int) (numeroByte + numeroShort + numeroInt + numeroLong);

        //Se imprime el valor de la variable en byte
        System.out.println("Valor de byte: " + numeroByte);
        //Conversion de byte a String y se guarda en variable
        String numeroByteStr = Byte.toString(numeroByte);


        //Se imprime el valor de la variable en short
        System.out.println("Valor de short: " + numeroShort);
        //Conversion de short a String y se guarda en variable
        String numeroShortStr = Short.toString(numeroShort);


        //Se imprime el valor de la variable en int
        System.out.println("Valor de int: " + numeroInt);
        //Conversion de int a String y se guarda en variable
        String numeroIntStr = Integer.toString(numeroInt);


        //Se imprime el valor de la variable en long
        System.out.println("Valor de long: " + numeroLong);
        //Conversion de short a String y se guarda en variable
        String numeroLogStr = Long.toString(numeroLong);


        //Concatenamos los String
        String sumaString = numeroByteStr + numeroShortStr + numeroIntStr + numeroLogStr;



        //Redactamos un mensaje con los datos que mostraremos
        String mensaje = "Estos serian todos los datos numéricos sumados o concatenados: " + sumaEnteros;
        mensaje += "\n" + "Estos son los String sumados o concatenados: " + sumaString;
        mensaje += "\n\n" + "Como vemos los datos numéricos se suman antes de ser convertidos";
        mensaje += "\n" + "Pero los datos String se colocan uno al lado del otro porque son texto";

        //Ventana emergente mostrando los datos
        JOptionPane.showMessageDialog(null,mensaje);

    }
}

/* Que es lo que estamos haciendo?
 * El programa le pide datos numéricos al usuario de diferentes tipos de datos como byte - short - int- long
 * El programa transformara datos numéricos a String o texto
 * Y los muestra haciendo comparativa concatenando con el operador +
 * Los numéricos antes de ser convertidos, para que se sumen
 * Y los datos ya convertidos en texto asi para que se coloquen uno alado del otro como texto
 * */

/*El proceso es simple
* Primero definimos las variables de tipo numérico
* Para luego que el usuario les dé un valor
* Sumamos los valores haciendo casting o forzando a que sean int, ya que todos los del mismo tipo
* Solo que con capacidad diferente

* En total serian cuatro valores y deberían ser transformados a String
* Como son distintos tipos de datos cada uno tiene su método correspondiente
* Byte.toString(numeroByte): Transforma el byte a String
* Short.toString(numeroShort): Transforma el short a String
* Integer.toString(numeroInt) : Transforma el int a String
* Long.toString(numeroLong) : Transforma el long a String

* Y al final mostramos los datos concatenados con los numéros antes de su conversion para que se sumen
* Y concatenamos los String para que se coloque uno alado del otro
* Y se aprecie la diferencia
*/