package MetodosString;

public class MetodoStartsWith {
    public static void main(String[] args) {

        /* También retorna true o false también recibe una cadena de caracteres
         * Y si la cadena de caracteres que recibe por ejemplo la palabra trabalenguas
         * si el parámetro que le demos es tr, tra o traba dará true, ya que así comienza la cadena de texto
         * De lo contrario si le decimos que busque lengua dará false */

        String trabalenguas = "trabalenguas \n";

        //Parámetros correctos retorna true
        System.out.println("trabalenguas = "+ trabalenguas);
        System.out.println("trabalenguas.startWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.startWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.startWith(\"trabaleng\") = " + trabalenguas.startsWith("trabaleng"));

        //Parámetros incorrectos retorna false
        System.out.println("\ntrabalenguas.startWith(\"rabaleng\") = " + trabalenguas.startsWith("rabaleng"));
        System.out.println("trabalenguas.startWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startWith(\"lengua\") = " + trabalenguas.startsWith("lengua"));
    }
}
