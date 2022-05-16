package Practicas;

public class PrintNomVariable {
    public static void main(String[] args) {
        //Definimos dos variables
        //Variable de tipo cadena de texto
        String nombre = "Christian";

        //Variable de tipo numérico entero
        int edad = 20;

        //Se imprimen mensajes concatenados con variables
        System.out.println("Hola mundo, mi nombre es " + nombre + " y mi edad es " + edad);
    }
}

/*Para definir una variable debemos especificar los siguientes parámetros:
 * Tipo de dato: Existen muchos tipos de datos, como String, byte, int, float, double, etc.
 * Nombre de la variable: Puede ser cualquiera mientras empiece con minúscula, ni sea una palabra reservada
 * El valor de la variable: Esto va a depender del tipo de dato*/

/*Hay varias formas de concatenar, pero la más común es con el operador +
 * En este caso concatenamos texto en duro con variables que pueden cambiar a cualquier valor  */