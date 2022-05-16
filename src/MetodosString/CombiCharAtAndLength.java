package MetodosString;

public class CombiCharAtAndLength {
    public static void main(String[] args) {

        String nombre = "Christian";
        System.out.println("Para imprimir el ultimo carácter - 1 ya que el 0 cuenta como un numero");

        //EL resultado de esto seria n, ya que captura solo un char o un carácter, la última letra del nombre
        System.out.println("nombre.charAt(nombre.length()-1)) = " + nombre.charAt(nombre.length()-1));
    }
}
