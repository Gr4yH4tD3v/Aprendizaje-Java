public class Variables {

    public static void main(String[] args) {

        //EJEMPLO 1: TRANSFORMAR STRING A MAYÚSCULA

        //Guarda un texto en un String
        String saludo = "Hola mundo desde java";
        //Se imprime el contenido de ese String
        System.out.println(saludo);

        //String tiene métodos, este es para texto en mayúscula
        System.out.println("Variable a mayúscula" + saludo.toUpperCase());

        //EJEMPLO 2: Asignando un valor de una variable a otra variable

        //Variable de tipo entero
        int numero = 10;

        //Variable de tipo booleano o lógico: true o, false
        boolean valor = true;

        //Variable de tipo entero
        int numero2 = 5;

        //if es una estructura de control condicional if significa: Si se cumple esto ejecuta esto
        //if recibe un valor booleano
        if (valor) {
            /* Las cosas que se definan en este contexto solo quedan aquí
             * También se pueden usar variables externas y modificarlas */
            System.out.println("numero = " + numero2);

            /* Por ejemplo la variable numero2 tenía un valor de 5
             * ahora definiendo un nuevo valor tendrá 10*/
            numero2 = 10;
        }

        /*En esta instrucción se imprime el valor de numero2 que ya no tiene un valor de 5
        ahora tiene un valor de 5*/
        System.out.println("numero2" + numero2);

        /*var es una variable dinámica que puede almacenar distintos tipos de valores
        * esto está disponible para versiones más actuales
        var numero3 = 15;
        var numero4 = "15"; */
    }
}


