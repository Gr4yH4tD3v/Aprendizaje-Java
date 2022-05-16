package MetodosString;

public class MetodoSubString {
    public static void main(String[] args) {

        //El substring toma un fragmento del String
        // desde una posición hacia adelante

        //Definimos String
        String nombre = "Christian";
        //Empieza desde la posicion 0 o sea desde el inicio
        System.out.println("nombre.substring(0) = " + nombre.substring(0));
        //Empieza desde la posicion 5
        System.out.println("nombre.substring(5) = " + nombre.substring(5));
        //El substring tambien puede recibir 2 parametros
        System.out.println("nombre.substring(1,8) = " + nombre.substring(1, 8));
        System.out.println("nombre.substring(2,6) = " + nombre.substring(2, 6));

    }
}
