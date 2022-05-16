package MetodosString;

public class MetodoLastIndexOf {
    public static void main(String[] args) {

        /* Este método funciona igual que al anterior, pero con la diferencia que
        * dependiendo del parámetro a buscar retorna la posición de la última conciencia,
        * a diferencia con del indexOf que buscaba la primera coincidencia
        * el lastIndexOf busca la última

        * Este método puede recibir un String y un char */

        //Define String
        String trabalengua = "trabalenguas";
        //Imprime String
        System.out.println("trabalenguas = "+ trabalengua);

        //Recibe el parámetro a buscar y empieza desde el último hacia adelante y retorna la primera coincidencia
        System.out.println("trabalenguas.lastIndexOf('a')) = " + trabalengua.lastIndexOf('a'));
    }
}
