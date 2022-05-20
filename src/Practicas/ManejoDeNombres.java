package Practicas;
//Importamos librería Scanner
import java.util.Scanner;

public class ManejoDeNombres {
    public static void main(String[] args) {
        //Definimos Objeto Scanner para capturar datos del usuario
        Scanner scanner = new Scanner(System.in);

        //Imprime mensaje
        System.out.print("Ingrese un nombre: ");
        //Captura dato del usuario y lo guarda en la variable
        String nombreA = scanner.nextLine();
        //Captura el segundo dato y lo transforma a mayúscula concatena con un punto y toma desde las últimas 2 letras
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length() - 2);

        //Hace lo mismo que el bloque de arriba
        System.out.print("Ingrese otro nombre: ");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length() - 2);

        //Hace lo mismo que el bloque de arriba
        System.out.print("Ingrese otro nombre de un familiar: ");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length() - 2);

        //Concatenamos las variables con un guion bajo entre cada variable y se guarda en resultado
        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        //Se imprime la variable resultado
        System.out.println(resultado);
    }
}

/*¿Cómo se debe comportar este programa?
* Primero necesitamos imprimir un nombre que introduce el usuario (En total deben ser 3)
* Se deben imprimir los nombres, pero de la siguiente manera

* Los nombres no deben tener la inicial
* La letra que deben empezar es la segunda ejemplo (Anya) debería empezar con la n
* Pero la segunda letra debe empezar en mayúscula

* Después debemos concatenarlo con un punto y con las últimas 2 letras del nombre (nombre + " . " + 2 ultimas iniciales)
* Es decir segunda letra del nombre concatenado con un punto y concatenando con las últimas 3 letras del nombre

* De esta forma si el nombre es Christian debería salir asi (H.an)
* Y como son 3 nombres y evitar que se amontonen debemos separarlos con un guion - para separar los nombres

* Antes de mostrar el resultado y queremos imprimir Christian, Anya, Pepe
* La salida de ejemplo debería ser: H.an_N.ya_E.pe
*/
