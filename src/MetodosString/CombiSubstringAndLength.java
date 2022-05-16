package MetodosString;

public class CombiSubstringAndLength {
    public static void main(String[] args) {

        String nombre = "Christian";
        System.out.println("nombre = "+ nombre);

        //Imprime la ultima letra
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        //COmo es el subtring puede capturar más datos imprime los últimos 3
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-3));
    }
}
