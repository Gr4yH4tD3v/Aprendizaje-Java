package Practicas;

public class ForBuscarLetra {
    public static void main(String[] args) {
        /*Explicación: Primero definimos una variable String que guarda una frase
         * Luego definimos una variable cantidad
         * Luego una variable que cuenta el valor máximo de la frase
         * Luego definimos una variable que guarda una letra
         * Definimos un for con la condición su i es menor a max que se siga iterando
         * Dentro del for definimos un if con la condición
         * Con la función chatAt entoces si i es diferente o igual a letra que continue
         * Y se aumenta el valor de cantidad
         * Y por cada vez que se repita imprime un texto con las variables cantidad y letra
         * Obteniendo asi cuantas veces se repite esa letra que buscamos*/

        String frase = "tres tristes tigres tragaban trigo en un trigal";
        int cantidad = 0;
        int max = frase.length();
        char letra = 't';

        for (int i = 0;i < max;i++){
            if(frase.charAt(i) != letra){
                continue;
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces el caracter '"+letra+"' en la frase");
    }
}
