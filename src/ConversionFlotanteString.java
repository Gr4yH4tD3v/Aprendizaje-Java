import javax.swing.*;

public class ConversionFlotanteString {
    public static void main(String[] args) {
        //Conversion de Flotante a String

        //Forma 1
        //Asignamos un valor a una variable double
        double numeroDouble = 1.23456;
        //Asignamos un valor a una variable double
        double numDoubleCienti = 1.23456e2;

        double sumaDouble = numeroDouble + numDoubleCienti;

        //Se imprime el valor
        System.out.println("numeroDouble = " + numeroDouble);
        //Se transforma double a String
        String numeroDoubleStr = Double.toString(numeroDouble);
        //Se imprime el String
        System.out.println("numeroDoubleStr = " + numeroDoubleStr + "\n");


        System.out.println("numero cientifico 1.23456e2");
        //Se imprime el valor
        System.out.println("numDoubleCienti = " + numDoubleCienti);
        //Se transforma double a String
        String numdoubleCientiStr = Double.toString(numDoubleCienti);
        //Se imprime el String
        System.out.println("numdoubleCientiStr = " + numdoubleCientiStr);

        String numString = numeroDoubleStr + numdoubleCientiStr;

        String mensaje = "Concatenación antes de transformar a String: " + sumaDouble;
        mensaje += "\nConcatenación después de la transformación a String: " + numString;

        System.out.println(mensaje);

        JOptionPane.showMessageDialog(null, mensaje);

        //Forma 2:

        //Transforma a String el valor que le damos
        String numeroFloatStr = String.valueOf(1.23456f);
        //Aquí concatenamos texto con un número y este quedara alado del texto y no se sumará
        System.out.println("Forma 2: = " + numeroFloatStr + 10);

    }
}
