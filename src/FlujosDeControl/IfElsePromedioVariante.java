package FlujosDeControl;

import java.util.Scanner;

public class IfElsePromedioVariante {
    public static void main(String[] args) {
        //Creamos un objeto Scanner
        Scanner in = new Scanner(System.in);

        //Se hace una pregunta al usuario
        System.out.print("Ingresa tu promedio: ");
        //Se guarda lo que introduzca el usuario
        double promedio = in.nextDouble();

        //Dependiendo de lo que introduzca el usuario se ejecutara algún bloque de código
        if (promedio >= 6.5) {
            System.out.println("Felicidades tienes un excelente promedio!");
        } else if (promedio >= 6.0) {
            System.out.println("Muy buen promedio!");
        } else if (promedio >= 5.0) {
            System.out.println("Buen promedio!");
        } else if (promedio >= 4.0) {
            System.out.println("Promedio Insuficiente, necesitas estudiar mas!");
        } else {
            System.out.println("Reprobado!");
        }

        //Se imprime el promedio
        System.out.println("Tu promedio es = " + promedio);


    }
}
