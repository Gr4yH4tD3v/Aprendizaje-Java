package MetodosString;

public class MetodoCharAt {
    public static void main(String[] args) {

        /*Este método recibe un valor entero y captura un carácter de acuerdo a la posición
         que le entreguemos, por ejemplo si le damos 0 captura el primer valor
         si le damos 1 captura el segundo valor.*/


        String nombre = "Christian";
        System.out.println("El largo de caracteres de Christan es de 9 caracteres \n");

        // Imprime hacia abajo por el println
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(2) = " + nombre.charAt(2));
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(4) = " + nombre.charAt(4));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(8) = " + nombre.charAt(8));
        System.out.println("nombre.charAt(6) = " + nombre.charAt(6));
        System.out.println("nombre.charAt(7) = " + nombre.charAt(7));

        //Imprime hacia el lado por el print
        System.out.print("\n" +nombre.charAt(0));
        System.out.print(nombre.charAt(1));
        System.out.print(nombre.charAt(2));
        System.out.print(nombre.charAt(3));
        System.out.print(nombre.charAt(4));
        System.out.print(nombre.charAt(5));
        System.out.print(nombre.charAt(6));
        System.out.print(nombre.charAt(7));
        System.out.print(nombre.charAt(8));
    }
}
