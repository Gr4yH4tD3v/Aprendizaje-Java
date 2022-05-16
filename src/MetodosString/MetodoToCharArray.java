package MetodosString;

public class MetodoToCharArray {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        //Convierte trabalenguas en un arreglo de char
        char[] arreglo = trabalenguas.toCharArray();
        //Calcula la longitud del arreglo
        int largo = arreglo.length;
        //Imprime el largo
        System.out.println("largo = " + largo);

        //Este es un bucle for
        //Dentro del for definimos variable i con valor inicial 0
        //Para que se repita i tiene que ser menor a largo
        //i++ o i + 1 = la variable con cada vuelta se auto incrementa 1
        for (int i = 0; i < largo; i++) {
            //Imprime valor de i o sea que en la primera será 0
            //En la segunda será 1 y asi sucesivamente hasta recorrer el array
            System.out.print(arreglo[i]);
        }
    }
}
