package MetodosString;

public class MetodoContains {
    public static void main(String[] args) {

        /* Este método recibe siempre un String, ya que si recibe un char dará error
         * En vez de retornar la posición retorna un true o false
         * Entonces esto sirve para corroborar si la secuencia de caracteres que estamos buscando esta o no,
         * retornando un true o false
         */

        //Definimos String
        String trabalengua = "trabalenguas";
        //Imprime String
        System.out.println("trabalnenguas = "+ trabalengua);

        //Buscamos la palabra lengua
        //Y el método busca si en el String contiene el parámetro que estamos ingresando
        System.out.println("trabalenguas.contains(\"lengua\") = " + trabalengua.contains("lengua"));

    }
}
