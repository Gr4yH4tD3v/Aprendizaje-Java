package Basico;

public class OperadoresRelacionales {
    public static void main(String[] args) {

        //EJEMPLO 1: Comparación ==

        //Caso 1: Si es falso
        //Definimos variables
        byte a = 3;
        int b = 2;

        //Se asigna la comparación dentro de una variable
        //¿a, es igual a b? No, por lo tanto es, false

        boolean b1 = a == b;
        System.out.println("El valor de a es igual al de b: " + b1);

        //Caso 2: Si es verdadero

        //Definimos variables o cambiamos el valor
        a = 3;
        b = 3;

        //¿a, es igual a b? Si por lo tanto es true

        boolean b2 = a == b;
        System.out.println("El valor de a es igual al de b: " + b2);

        //EJEMPLO 2: Invertir el valor

        //Definimos variables o cambiamos el valor
        a = 3;
        b = 2;

        //¿a, es igual a b? No por lo tanto es, false
        boolean b3 = a == b;
        System.out.println("Aquí el valor no es igual al otro: = " + b3);

        //Aquí, a, sigue siendo diferente, pero con el operador se invierte en vez de no va a decir que si y viceversa
        boolean b4 = !b3;
        System.out.println("Aquí el valor no es igual al otro pero se invierte con !: " + b4);

        //EJEMPLO 3: Distinto a !=

        a = 3;
        double bb = 1.5;
        //¿a, es diferente a, bb? Si por lo tanto es true
        boolean bb1 = a != b;

        System.out.println("El valor de a y el valor de bb son diferente: = " + bb1);

        //EJEMPLO 4: Mayor (>) y Menor que (<)

        a = 3;
        b = 10;
        //¿a, es mayor a b? No por lo tanto es, false
        boolean b5 = a > b;

        System.out.println("El valor de a es mayor que b? = " + b5);

        //¿a, es menor a b? Si por lo tanto es true
        b5 = a < b;

        System.out.println("El valor de a es menor que b? = " + b5);

        //EJEMPLO 5: Mayor o igual ( >= ) Menor o igual ( <= )

        a = 10;
        b = 10;

        //¿a, es mayor que b? No, pero, ¿a, es igual que b? Si por lo tanto es true
        b5 = a >= b;

        System.out.println("a es mayor o igual que b = " + b5);

        a = 3;
        b = 10;

        //a es menor que b si pero a es igual que b? no pero de igual es true
        b5 = a <= b;

        System.out.println("3 es menor a 10 = " + b5);

        //a es menor que b si pero a es igual que b? no pero de igual es true
        b5 = a <= b;

        System.out.println("3 es menor o igual a 10 = " + b5);



    }
}
