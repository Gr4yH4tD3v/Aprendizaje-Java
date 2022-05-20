package Practicas;
//Importamos Librerías
import java.util.Scanner;

public class SimuladorEstanqueGasolina {
    public static void main(String[] args) {
        //Creamos objeto Scanner
        Scanner in = new Scanner(System.in);

        //Pregunta al usuario y lo que introduzca el usuario se guarda en una variable
        System.out.println("Ingrese su capacidad actual de gasolina (max 70): ");
        int capacidadGas = in.nextInt();

        //Dependiendo de lo que el usuario introduzca se ejecutara alguna de estas opciones
        if (capacidadGas >= 0 && capacidadGas <= 20) {
            System.out.println("Gasolina Insuficiente");
        } else if (capacidadGas >= 20 && capacidadGas <= 35) {
            System.out.println("Gasolina Suficiente");
        } else if (capacidadGas >= 35 && capacidadGas <= 40) {
            System.out.println("Medio Estanque");
        } else if (capacidadGas >= 40 && capacidadGas <= 60) {
            System.out.println("Estanque 3/4");
        } else if (capacidadGas >= 60 && capacidadGas < 70) {
            System.out.println("Estanque casi lleno");
        } else if (capacidadGas == 70) {
            System.out.println("Estanque Lleno");
        } else if (capacidadGas > 70) {
            System.out.println("Esta capacidad está fuera de rango");
        }


    }
}
