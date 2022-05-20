package Practicas;

import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        //Ventanas emergentes guardando nombres y apellidos que introduzca el usuario
        String per1 = JOptionPane.showInputDialog("Ingrese el un nombre y apellido: ");
        String per2 = JOptionPane.showInputDialog("Ingrese el un segundo nombre y apellido: ");
        String per3 = JOptionPane.showInputDialog("Ingrese el un tercer nombre y apellido: ");

        //El método split separa un String en más String dándole un carácter con el cual separarlos
        //El método length sirve para medir la longitud del String

        //Con split separamos desde el espacio con el indice 0 accedemos al nombre y con length medimos la longitud
        //En esta primera parte estamos guardando una pregunta si per1 es menor a per2 y se guarda el mayor de los 2 en la variable max
        String max = (per1.split(" ")[0].length() < per2.split(" ")[0].length()) ? per2 : per1;
        //Aqui hacemos lo mismo
        max = (per3.split(" ")[0].length() < max.split(" ")[0].length()) ? max : per3;

        //Mostramos los resultados
        String resultado = "El nombre mas largo es: " + max;
        System.out.println("Los nombres introducidos son: " + per1 + " - " + per2 + " - " + per3);
        System.out.println(resultado);

    }
}
