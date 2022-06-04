package FlujosDeControl;

public class WhileNumeros {
    public static void main(String[] args) {
        //Variable i
        int i = 0;

        //Definimos un while con la condición:
        //Mientras i sea menor a 5 se va a ejecutar
        while(i < 5){
            //Se imprime el valor actual de i
            System.out.println("i = " + i);

            //i se aumenta de 1 en 1
            i++;
        }
    }
}

/*La salida será la siguiente:
 i = 0
 i = 1
 i = 2
 i = 3
 i = 4
 */