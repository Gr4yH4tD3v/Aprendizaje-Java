package Basico;

public class OperadoresLogicos {
    public static void main(String[] args) {

        /*- Hay dos tipos el AND y el OR y podemos evaluar dos expresiones u operaciones relacionales.
        - Por un lado tenemos en operador AND que evalúa que todas se cumplan, es decir que todos sean true.
            Es decir si la variable 1 y la variable 2 se cumplen el resultado será true. Pero si uno de los 2
            si no se cumple falla y será false

            - Por ejemplo si tenemos 2 valores que se deben cumplir si el primero no se cumple no tiene sentido evaluar
                la segunda y hace cortocircuito y lanza él false.

            - Mientras él el OR si al menos uno de las 2 expresiones es true, la expresión completa es true.
            - Por ejemplo si la primera es true ya no tiene sentido evaluar la segunda,
                ya que se cumplió la condición, para que la toda la expresión sea true*/

        //EJEMPLO 1: AND ( && )

        //Caso 1: Cuando es True

        int a = 5;
        int b = 5;
        double c = 1.5;
        double d = 1.5;
        //¿a, es igual que b Y c es igual que d? Si por lo tanto es true
        boolean b1 = a == b && c == d;

        System.out.println("¿a, es igual que b Y c es igual que d? = " + b1);

        //Case 2: Cuando es false

        a = 5;
        b = 5;
        c = 1.5;
        d = 4.3;

        //¿a, es igual que b Y c es igual que d?
        //a y b Si por pero c y d no son iguales por lo tanto es false

        b1 = a == b && c == d;

        System.out.println("¿a, es igual que b Y c es igual que d? = " + b1);

        //EJEMPLO 2: OR ( || )

        //Caso 1: Cuando es true

        a = 5;
        b = 5;
        c = 1.5;
        d = 1.5;

        //¿Para qué de true es necesario que al menos una de las 2 preguntas sean true
        //a y b son iguales es true o c es mayor que d? No son iguales pero sigue siendo true

        b1 = a == b || c > d;

        System.out.println("¿a es igual a b o c es mayor a d? = " + b1);

        //Caso 2: Cuando es falso

        a = 5;
        b = 3;
        c = 1.5;
        d = 1.6;

        //Ninguna de las 2 condiciones se cumple por lo tanto es, false
        b1 = a == b || c == d;

        System.out.println("a es igual a b o c es mayor a d? = " + b1);

    }
}
