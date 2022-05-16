package MetodosString;

public class MetodoIndexOf {
    public static void main(String[] args) {

        /*Este método permite saber si se encuentra algún carácter dentro del String,
        retorna la posición el índice de la primera incidencia, es decir,
        si se encuentra una frase dentro del String que coincida con el parámetro ingresado,
        va a retornar como resultado la posición del primer valor de la posición que coincida
        o sea si hay 10 conciencias, a tomar la primera

        Este metodo puede recibir un string o un char*/

        String trabalengua = "trabalenguas";

        /*La primera se encuentra en la posición 2 porque, porque el 0 también ocupa una posición
         * t = 0
         * r = 1
         * a = 2
         * b = 3
         * a = 4
         */
        System.out.println("trabalengua.indexOf('a')) = " + trabalengua.indexOf('a'));
    }
}
