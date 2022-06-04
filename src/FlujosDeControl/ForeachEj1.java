package FlujosDeControl;

public class ForeachEj1 {
    public static void main(String[] args) {
        //El foreach se utiliza para iterar sobre arreglos

        //Definimos un arreglo
        int[] numeros = {1,3,5,6,7,8,14,15};
        //Esto va a recorrer los números del arreglo y lo asigna a num
        for (int num: numeros) {
            //Mostramos el valor actual de num
            System.out.println("num = " + num);
        }
    }
}
/*La salida es la siguiente:
 num = 1
 num = 3
 num = 5
 num = 6
 num = 7
 num = 8
 num = 14
 num = 15
*/