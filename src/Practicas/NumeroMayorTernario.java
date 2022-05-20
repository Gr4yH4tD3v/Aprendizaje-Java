package Practicas;
//Importamos Librería
import java.util.Scanner;

public class NumeroMayorTernario {
    public static void main(String[] args) {

        //Creamos objeto Scanner
        Scanner in = new Scanner(System.in);

        //Preguntas al usuario y guardándolas en variables las respuestas
        System.out.print("Ingrese un numero: ");
        int num1 = in.nextInt();
        System.out.print("Ingrese un segundo numero: ");
        int num2 = in.nextInt();
        System.out.print("Ingrese un tercer numero: ");
        int num3 = in.nextInt();

        //Definimos la variable donde queda el valor maximo
        int max = 0;

        //Número 1 en mayor a número 2? Retorna una de las variables guardándola a la variable max
        max = (num1 > num2) ? num1 : num2;
        //Compara el valor máximo entre las variables anteriores con un número 3 y retorna el valor mayor, y la guarda en max
        max = (max > num3) ? max : num3;

        //Muestra los números introducidos
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        //Imprime el mayor valor de entre los 3 que ahi
        System.out.println("El numero mayor es: " + max);

    }
}
