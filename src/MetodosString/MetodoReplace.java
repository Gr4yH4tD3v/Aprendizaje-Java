package MetodosString;

public class MetodoReplace {
    public static void main(String[] args) {

        /* Este método sirve para cambiar un carácter por otro en un String
         * El primer valor es el que se va a reemplazar y luego se coloca un segundo valor, el nuevo carácter
         */

        //Definimos String
        String trabalengua = "trabalenguas";
        //Imprime valor del String
        System.out.println("trabalnenguas = "+ trabalengua);

        //Los parámetros que recibe replace es la letra que vamos a reemplazar y el remplazo
        //El resultado de esto seria: tr.b.lengu.s
        System.out.println("trabalenguas reemplazando las a por puntos = " + trabalengua.replace("a","."));
    }
}
