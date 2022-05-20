package Basico;

public class OperadoresUnarios {
    public static void main(String[] args) {

        /*- Hay 2 operadores unarios, uno positivo (+ ) y el otro negativo ( - )
        que simplemente operan con un valor numérico.

        - Este valor ya sea literal o una variable, lo que hace es invertir el signo del número del entero,
        o también si trabajamos con decimales, un double o float.

        - En matemática se le conoce como multiplicar por menos, por menos 1, un número que es negativo
        y lo multiplicamos con un signo menos, el valor es más, porque (menos por menos da más) y (menos por más da más).

        - Al final es para invertir el valor positivo a negativo y viceversa.
        - Eso se le conoce como operador unario menos ( - ) y unario mas ( + )
        */

        int a = -5;

        int b = +a; //b=(1)*a => -5
        System.out.println("b = " + b);

        int c = -a; //c= (-1)*1 => 5
        System.out.println("c = " + c);

        a = 6;
        b = +a;
        System.out.println("b = " + b);

        c = -a;
        System.out.println("c = " + c);

    }
}
