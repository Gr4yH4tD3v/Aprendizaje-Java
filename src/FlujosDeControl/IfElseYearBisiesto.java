package FlujosDeControl;

import java.util.Scanner;

public class IfElseYearBisiesto {
    public static void main(String[] args) {
        //Se crea un objeto Scanner
        Scanner in = new Scanner(System.in);

        //Se le hacen preguntas al usuario
        System.out.print("Ingrese un mes (1 - 12): ");
        int mes = in.nextInt();

        System.out.print("Ingrese un año (YYYY): ");
        int year = in.nextInt();

        //Se define variable
        int numeroDias = 0;

        //Si mes es igual a alguna de estas opciones el mes tiene 31 dias
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            //estos son los meses que tienen 31 dias
            numeroDias = 31;

         //Si el mes coincide con alguna de estas opciones tiene 30 dias
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            //estos son los meses que tienen 30 dias
            numeroDias = 30;

         //Si el mes coincide con 2 es bisiesto
        } else if (mes == 2) {
            //Si el resto de year entre 400 es igual a cero es bisiesto
            //o
            //si el resto de year entre 4 es igual a cero,
            //pero ademas (&&)
            //si el resto de year entre 100 es igual a cero es bisiesto
            if (year % 400 == 0 || ((year % 4 == 0) && (year % 100 == 0))) {
                numeroDias = 29;

             //Si no tiene 28 dias
            } else {
                numeroDias = 28;
            }
          //y si no coincide con ninguna el mes no existe
        } else {
            System.out.println("ERROR, este mes no existe!!");
        }

        //Se imprimen los resultados
        System.out.println("Este mes tiene: " + numeroDias + " dias!");

    }
}
