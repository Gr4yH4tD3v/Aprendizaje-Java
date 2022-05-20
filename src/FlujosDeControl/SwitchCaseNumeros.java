package FlujosDeControl;

import java.util.Scanner;

public class SwitchCaseNumeros {
    public static void main(String[] args) {

        /*- flujo de control switch case, nos permite ejecutar algún código o alguna acción según el valor
        de una variable, el estado, a diferencia del if que ejecuta código mediante un valor booleano (true o false).

        - Pero en este caso compara por un valor, es decir toma un valor de una variable y lo compara
        y va evaluando casos, si hay un caso que coincide con ese valor de esa variable el switch o interruptor
        ejecuta el código que este dentro del caso que coincida con ese valor.*/

        //Creamos objeto Scanner
        Scanner in = new Scanner(System.in);

        //Se imprime una pregunta al usuario y lo que introduzca se guarda en la variable
        System.out.print("Ingrese un numero del (0 al 5): ");
        int num = in.nextInt();

        //Basándonos en el valor de una variable ejecuta el caso con que coincida el valor
        switch (num) {
            case 0:
                System.out.println("El numero es cero");
                //el break es para que no ejecute todos los casos
                break;
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
            case 4:
                System.out.println("El numero es cuatro");
                break;
            case 5:
                System.out.println("El numero es cinco");
                break;
            default:
                //Si no coincide con ningún caso ejecuta el caso que tiene por defecto
                System.out.println("No existe este opción");
                break;
        }

    }
}
