package MetodosString;

public class MetodoEqualsIgnoreCase {
    public static void main(String[] args) {

        //Se define un String
        String nombre = "Christian";

        //Compara caracteres si son iguales o no
        //y deja de lado si tiene mayúsculas o minúsculas y solo compara el valor
        System.out.println("nombre.equalsIgnoreCase(\"christian\") = " + nombre.equalsIgnoreCase("cHriStIan"));

    }
}
