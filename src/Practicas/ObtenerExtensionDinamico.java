package Practicas;
import javax.swing.JOptionPane;
public class ObtenerExtensionDinamico {
    public static void main(String[] args) {


        //Mensaje pidiendo datos al usuario
        String archivo = JOptionPane.showInputDialog(null,"Introduzca un nombre de archivo + una extensión: \nEjemplo \"example.jpg\"");

        //Va a capturar desde el primer punto hacia adelante
        int i = archivo.lastIndexOf(".");

        //Largo del String se imprime en la consola
        System.out.println("Largo del archivo = " + archivo.length());

        //Captura el punto hacia adelante
        String extension1 = "Extension con el punto: " + archivo.substring(i);

        //Captura después del punto, o sea que el punto no lo incluye
        String extension2 = "Extension si el punto: " + archivo.substring(i+1);

        //Redactamos mensaje
        String mensaje = "Extensión con 2 formatos:";
        mensaje += "\n\n"+ "El archivo es: "+ archivo;
        mensaje += "\n" + extension1;
        mensaje += "\n" + extension2;

        //Imprime mensaje en pantalla emergente
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

/* ¿Qué hace este programa?
 * Primero le pide al usuario un nombre de archivo con la extencion "example.jpg" o la extención que sea
 * Con el substring definimos que va a postrar lo que este después del punto
 * Y es asi como podemos colocar cualquier nombre y siempre va a capturar después del punto o con el punto
 * Y finalmente mostramos los datos  */