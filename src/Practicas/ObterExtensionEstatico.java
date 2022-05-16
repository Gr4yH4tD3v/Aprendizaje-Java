package Practicas;

public class ObterExtensionEstatico {
    public static void main(String[] args) {

        String archivo = "alguna_imagen.jpg"; //Tiene 17 caracteres

        //Imprime cuantos caracteres tiene (Tiene 17)
        System.out.println("archivo.length() = " + archivo.length());

        //Desde el carácter 14 está la extensión
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
    }
}

/*¿Qué hace el programa?
* Lo único que hace es simular obtener la extension de un supuesto archivo jpg
* Esto es totalmente estático, esto significa que si cambias el Sting,
* devolvería otra parte del String que no necesitemos*/

/*Busca en esta misma carpeta como lo hago de forma dinámica, o sea que funcione con cualquier String*/