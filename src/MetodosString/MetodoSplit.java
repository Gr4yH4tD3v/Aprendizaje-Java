package MetodosString;

import java.util.Arrays;

public class MetodoSplit {
    public static void main(String[] args) {

        //El metodo split sirve para separar un String en mas String

        //Definimos un String
        String string = "12345-6789";
        //Definimos un Array de String y le asignamos el método y el elemento donde se va a separar
        String[] partes = string.split("-");
        String parte1 = partes[0]; // 12345
        String parte2 = partes[1]; // 6789

        System.out.println("Primera parte: "+ parte1);
        System.out.println("Segunda parte: " + parte2);


        /*Los metacaracteres son caracteres no alfabéticos que poseen un significado especial en las expresiones
        regulares. que son : \ , ^ , $ , . , | , ? , * , + , ( , ) , { , } , [

        Si estos son usados directamente para separar una cadena no funcionaran adecuadamente, ejemplo:*/

        String cadena = "Salida|mal|funcionamiento";
        String[] parts = cadena.split("|");
        System.out.println(Arrays.asList(parts));

        //estos caracteres deben ser escapados antecediendo el carácter "\", ejemplo:

        String cadena1 = "Salida|Buen|Funcionamiento";
        String[] parts1 = cadena1.split("\\|");
        System.out.println(Arrays.asList(parts1));
    }
}
