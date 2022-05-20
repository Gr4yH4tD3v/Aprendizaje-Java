package FlujosDeControl;

import java.util.Scanner;

public class SwitchCaseYearBisiesto {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese un mes (1 - 12): ");
        int mes = in.nextInt();

        System.out.print("Ingrese un año (YYYY): ");
        int year = in.nextInt();
        int numeroDias = 0;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7: // en estos casos al no colocar break es como decir que
            case 8: // seria similar a un or
            case 10:
            case 12:
                //estos son los meses que tienen 31 dias
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                //estos son los meses que tienen 30 dias
                numeroDias = 30;
            case 2:
                if (year % 400 == 0 || ((year % 4 == 0) && (year % 100 == 0))) {
                    numeroDias = 29;

                } else {
                    numeroDias = 28;
                }
                break;
            default:
                System.out.println("ERROR, este mes no existe!!");
        }
        System.out.println("Este mes tiene: " + numeroDias + " dias!");


    }
}
