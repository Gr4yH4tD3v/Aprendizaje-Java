package Basico;

public class ConcatenandoString {
    public static void main(String[] args) {
        //FORMA 1: CONCATENANDO CON +

        //Declaración de variables String
        String curso = "Programación Java";
        String profesor = "Christian Gutierrez";

        //Concatenación de variables con + curso - un texto - profesor
        //Es importante que en algunas partes tengan espacios para evitar que se amontonen
        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        //CONCATENACIÓN ENTRE NÚMEROS Y STRING

        int numeroA = 10;
        int numeroB = 5;

        //Al concatenar va a ser 105 de texto porque lee de derecha a izquierda
        //y como lo primero que se encuentra es texto lo va a concatenar como texto
        System.out.println(detalle + numeroA + numeroB);

        //Al encerrar la parte numérica con paréntesis le estamos dando prioridad
        //Por lo tanto primero sumará y luego concatenará con el texto de forma correcta
        System.out.println(detalle + (numeroA + numeroB));

        //el orden importa mucho si por ejemplo colocamos al revés queda así
        //El número queda al principio
        System.out.println((numeroA + numeroB) + detalle);


        //FORMA 2: CONCATENAR CON MÉTODO
        //método de concatenación
        String detalle2 = curso.concat(profesor);

        //Concatenaría lo mismo que está arriba, pero no tiene el espacio
        //Por lo tanto para arreglar eso anidamos de la siguiente forma
        String detalle3 = curso.concat(" ".concat(profesor));

        //También se puede ser asi
        String detalle4 = curso.concat(" con ").concat(profesor);
        //Y podríamos seguir anidando si quisiéramos

        System.out.println("\nForma clásica de concatenar: " + detalle);
        System.out.println("Concatenación con método, pero con un error de espacio: " + detalle2);
        System.out.println("Concatenación con método anidado arreglando el error: " + detalle3);
        System.out.println("Concatenación con método agregándole una frase y arreglado el error: " + detalle4 );

    }
}
