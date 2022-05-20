package FlujosDeControl;

import java.util.Scanner;

public class IfElsePromedio {
    public static void main(String[] args) {

        /*if y else siempre se va a ejecutar uno de los dos, nunca ambos
        es if o else que se ejecuta dependiendo de la condición

        */

        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa tu promedio: ");

        double promedio = in.nextDouble();

        if (promedio >= 6.5) {
            //Si se cumple la condición se ejecuta lo que esté aquí dentro
            System.out.println("Felicidades tienes un excelente promedio!");

        } else {
            //Si no se cumple el if se cumple lo que esté aquí dentro
            System.out.println("Necesitas esforzarte un poco mas!");

        }

    }
}
