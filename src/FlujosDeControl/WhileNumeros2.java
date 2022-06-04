package FlujosDeControl;

public class WhileNumeros2 {
    public static void main(String[] args) {
        int i = 0;
        boolean prueba = true;

        //Mientras sea true se va a iterar
        while (prueba){
            if(i == 7){
                //cuando sea i sea igual a 7 va a ser false y se va a dejar de iterar
                prueba = false;
            }
            System.out.println("i = " + i);
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
 i = 5
 i = 6
 i = 7*/