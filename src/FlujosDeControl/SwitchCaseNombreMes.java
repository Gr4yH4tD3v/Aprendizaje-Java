package FlujosDeControl;

import java.util.Scanner;

public class SwitchCaseNombreMes {
    public static void main(String[] args) {
        //Se crea un objeto Scanner
        Scanner in = new Scanner(System.in);

        //Se hace una pregunta al usuario y lo que introduzca se guarda en la variable
        System.out.print("Ingrese el numero de un mes (1 al 12): ");
        int mes = in.nextInt();

        //Definimos una variable
        String nombreMes = null;

        //Basándose en esta variable asignará un valor que coincida con el caso a la variable que definimos anteriormente
        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                System.out.println("Este mes no existe");
                break;
        }

        //Se imprime el resultado
        System.out.println("El mes es: " + nombreMes);

    }
}
