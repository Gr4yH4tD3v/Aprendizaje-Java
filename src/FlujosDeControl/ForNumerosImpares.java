package FlujosDeControl;

public class ForNumerosImpares {
    public static void main(String[] args) {

        //Definimos bucle for
        //Condición: si i es menor o igual a 10 se va a repetir
        //Cada vez que se repita i aumentará en 1

        for (int i = 0; i <= 10; i++) {
            //si el modulo o excedente de 2 al valor de i es igual a 0
            if (i % 2 == 0) {
                //cada vez que el número sea par se sale
                //e imprime el número impar
                //continue hace que se salga del contexto de if
                //Si el número resulta ser par se vuelve a repetir el bucle imprimiendo el impar
                continue;
            }

            System.out.println("i = " + i);
        }
    }
}

/*El resultado será este:
i = 1
i = 3
i = 5
i = 7
i = 9
*/