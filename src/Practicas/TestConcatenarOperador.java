package Practicas;

import javax.swing.*;
public class TestConcatenarOperador {
    public static void main(String[] args) {
        //Concatenar con operador

        //Basico.Variables
        String a = "a";
        String b = "b";
        String c = a;

        //Empieza a contar
        long inicio = System.currentTimeMillis();

        //Bucle
        for(int i = 1; i < 500; i++){
        //c = c + a + b + "\n"
            c += a + b + "\n"; // 500 += 17 ms; 1000 += 21ms
        }

        //Termina de contar
        long fin = System.currentTimeMillis();

        //Guardamos los milisegundos
        String milli = String.valueOf((fin-inicio));
        //Redactamos mensaje
        String demora = "Concatenación con + se demora: " + milli + " Milisegundos";

        //Iteraciones
        System.out.println("c = " + c);
        //Mensaje emergente mostrando el resultado
        JOptionPane.showMessageDialog(null, demora);

    }
}
