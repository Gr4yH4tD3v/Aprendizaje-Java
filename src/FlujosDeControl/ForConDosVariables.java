package FlujosDeControl;

public class ForConDosVariables {
    public static void main(String[] args) {
        //Primero definimos variable i con valor inicial de 1
        //Después definimos otra variable j con valor inicial 10

        //Si i es menor a j se va a repetir

        //cada vez que se repita i ira aumentando de 1 en 1
        //cada vez que se repita j ira decrementando de 1 en 1

        /*Inicializamos 2 variables i con valor de 1 y j con valor de 10
          Mientras i sea menos a j se va a repetir
          Cada vez que se repita i irá aumentando de 1 en 1
          Cada vez que se repita j irá decrementando de 1 en 1
          vamos imprimiendo el valor de i y j
          Lo separo con una coma para que no se amontone
        * */
        for (int i = 1, j = 10; i < j; i++, j--) {
            System.out.println(i + " - " + j);
        }
    }
}

/*El resultado será este:
 1 - 10
 2 - 9
 3 - 8
 4 - 7
 5 - 6
*/