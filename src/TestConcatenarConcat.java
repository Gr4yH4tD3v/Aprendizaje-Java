import javax.swing.*;

public class TestConcatenarConcat {
    public static void main(String[] args) {
        //Forma 2: Concatenar con método concat

        //Variables
        String a = "a";
        String b = "b";
        String c = a;

        //Empieza a contar
        long inicio = System.currentTimeMillis();

        //Bucle
        for(int i = 1; i < 500; i++){
            c = c.concat(a).concat(b).concat("\n"); //500 ms => 2ms; 1000 += 4ms;
        }

        //Termina de contar
        long fin = System.currentTimeMillis();

        //Guarda los mili segundos
        String milli = String.valueOf((fin-inicio));
        //Iteraciones
        System.out.println("c = " + c);

        //Redactamos mensaje
        String demora1 = "Concatenación con concat se demora: " + milli + " Milisegundos";

        //Mostramos mensaje en ventana emergente
        JOptionPane.showMessageDialog(null, demora1);
    }
}
