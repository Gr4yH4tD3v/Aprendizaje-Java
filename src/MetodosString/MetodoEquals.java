package MetodosString;

public class MetodoEquals {
    public static void main(String[] args) {

        /*Debemos tener en cuenta que si definimos 2 String son 2 objetos diferentes
        * A pesar de que pueden tener el mismo valor o sea si comparamos con el ==
        * Está comparando si el String1 es igual al String 2  (String1 == String2)
        * Pero para comparar el valor del String usamos el método equals*/

        //Se define un String
        String nombre = "Christian";

        //Compara si el valor de la variable es exactamente igual
        //Aquí esta exactamente escrito por lo tanto si serán iguales y dará true
        System.out.println("nombre.equals(\"Christian\") = " + nombre.equals("Christian"));

        //Aquí esta hay diferencias entre mayúsculas por lo tanto no serán iguales y dará, false
        System.out.println("nombre.equals(\"christian\") = " + nombre.equals("christian"));

        /*Aunque dicen lo mismo y se podría solucionar implementando el método equalsIgnoreCase
        * para ignorar comparar por mayúsculas y solo el valor */

        //System.out.println("nombre.equalsIgnoreCase(\"christian\") = " + nombre.equalsIgnoreCase("christian"));
    }
}
