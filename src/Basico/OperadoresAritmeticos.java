package Basico;

import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //EJEMPLO 1: Suma

        //Definimos variables y la inicializamos con un valor y luego se guarda una suma en una variable
        int a = 5, b = 4, suma = a + b;

        //Se imprime el valor que da la suma entre 2 variables
        System.out.println("suma = " + suma);

        //Ejemplo 2: Sumar números y concatenarlos a un String en una sola linea

        //Forma errónea
        //Como tiene un String delante lo toma como String o sea que a este String se le añade el texto 5 y el texto 4
        //Por lo tanto los números que trataríamos de sumar son 5 y 4, no daria 9, sino que un número alado de otro 54
        System.out.println("Esto es un texto " + a + b);

        //Forma correcta

        //Al tener primero las variables numéricas se concatenan al string
        System.out.println(a + b + " a + b + String = ");

        //O se puede usar la prioridad con paréntesis

        System.out.println("Esto no es un texto " + (a + b + 2));

        //También se pueden aplicar todos los operadores aritméticos

        //EJEMPLO 3:Operadores aritméticos

        //Resta
        int resta;
        //Definimos valores y guardamos operación aritmética en una variable
        a = 5; b = 4; resta= a - b;

        System.out.println("resta = " + resta);
        System.out.println("a - b= " + (a - b));

        //Multiplicación
        int multipli = a * b;
        System.out.println("multipli= " + multipli);
        System.out.println("a * b= " + (a * b));

        //División
        int div = a / b;
        //Aqui hacemos un casting o forzar a cambiar el tipo de datos de las variables
        float div2 = (float) a /b;

        System.out.println("div= " + div);
        System.out.println("div2= " + div2);

         //EJEMPLO 4: Resto

        //El resto es excedente de una división
        //Ejemplo: 2 / 2 = 0 no sobra nada
        //Ejemplo: 2 / 5 = 2 sobra 2
        //Ejemplo: 5 / 4 = 1 sobra 1


        a = 5; b = 4; int resto = a % b;

        System.out.println("resto = " + resto);
        System.out.println("a % b = " + (a % b));

        //EJEMPLO 5: Como saber si un numero es par o impar con el modulo %

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        //Si número resto 2 es igual a 0 el numero es par
        if(numero % 2 == 0){
            System.out.println("numero par = " + numero);
            //si no es impar
        }else {
            System.out.println("numero impar = " +  numero);
        }



    }
}
