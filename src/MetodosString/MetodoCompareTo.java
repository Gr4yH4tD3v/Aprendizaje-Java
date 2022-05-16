package MetodosString;

public class MetodoCompareTo {
    public static void main(String[] args) {
        /* Este es otro método para comparar caracteres, este va a tomar un String
         * y lo compara con otro String, pero esta comparación es a escala de orden alfabético,
         * pero no es el orden alfabético del abecedario. Aca ordena según el orden lexicográfico
         * que está basado en relación de orden definida sobre la tabla unicode.
         * En otras palabras realiza comparación sobre el orden numérico de cada código que está en la tabla.
         */

        String nombre = "Christian";

        //Compara en un orden lexicográfico si el valor da 0 son iguales
        System.out.println("nombre.compareTo(\"Christian\") = " + nombre.compareTo("Christian"));
    }
}
