package Basico;

public class OperadoresAsignacion {
    public static void main(String[] args) {

        /* Con el valor de asignación como su nombre lo indica asignamos un valor a una variable
         * ya sea un literal, una instancia, una clase, cualquier cosa.
         * Cada vez que se asigna un valor o una instancia, una referencia o objeto a una variable
         * usamos el operador de asignación ( = )
         */

        //EJEMPLO 1: Como asignar un valor a una variable

        //Lo que hacemos es asignar un valor a una variable
        //El operador de asignación es ( = )
        int a = 3;

        //EJEMPLO 2: Asignar una operación aritmética a una variable
         a = 3; int suma = a + 3;

         //EJEMPLO 3: Asignación Simplificada
        //Esta es la que vimos
        a = 3;
        //a valdría 5
        a = a + 2;

        //Esta es la simplificada
        //La forma simplificada de lo anterior es lo siguiente:
         a =3;
        //El valor de a es 5
         a += 2;

        System.out.println("a = " + a);

        //EJEMPLO 4: Forma simplificada de asignación de los demás operadores

        //Resta
        a = 10; a -= 3;
        System.out.println("a = " + a);

        //Multiplicación
        a = 10; a *= 3;
        System.out.println("a = " + a);

        //División
        a = 10; a /= 2;

        System.out.println("a = " + a);

        //EJEMPLO 5: Asignación simplificada con String

        String str = "Hola esto es: ";
        str += "Una concatenación";
        str += " simplificada";

        System.out.println("str = " + str);

    }
}
