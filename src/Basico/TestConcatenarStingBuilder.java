package Basico;

import javax.swing.*;

public class TestConcatenarStingBuilder {
    public static void main(String[] args) {
        //Forma 3: Concatenar con método StringBuilder

        //Basico.Variables
        String a = "a";
        String b = "b";
        String c = a;

        //Creamos un objeto con el String builder
        //Con el método append concatenamos
        StringBuilder sb = new StringBuilder(a);

        //empieza a contar
        long inicio = System.currentTimeMillis();

        //Bucle
        for(int i = 1; i < 500; i++){
            //Con el método append lo devuelve la misma instancia del StringBuilder
            //Y lo podemos usar muchas veces
            sb.append(a).append(b).append("\n"); //500 += 0ms; //100 += 0ms;
        }

        //Termina de contar
        long fin = System.currentTimeMillis();

        //Guardamos milisegundos en variable
        String milli = String.valueOf((fin-inicio));
        //Iteraciones
        System.out.println("sb = " + sb.toString());
        //Redactamos mensaje
        String demora2 = "Concatenación con StringBuilder se demora: " + milli + " Milisegundos";

        //Muestra datos emergentes
        JOptionPane.showMessageDialog(null, demora2);
    }
}
