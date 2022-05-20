package Practicas;
//Importando librería
import java.util.Scanner;

public class NumerosOrdenadosTernario {
    public static void main(String[] args) {

        //Creando un objeto Scanner
        Scanner in = new Scanner(System.in);

        //Preguntas al usuario y las respuestas guardándolas en variables
        System.out.print("Ingrese un numero: ");
        int num1 = in.nextInt();
        System.out.print("Ingrese un segundo numero: ");
        int num2 = in.nextInt();

        //Se guarda una pregunta, número 1 es mayor a número 2? Y guardara cualquiera de las 2 opciones existentes en est caso
        String resul = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        //Imprime un texto concatenado con el resultado
        System.out.println("El orden de los números de mayor a menor es: " + resul);
    }
}
