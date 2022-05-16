package Practicas;
//Librería
import java.util.Scanner;

public class DetalleFactura {

    public static void main(String[] args) {
        //Creamos objeto Scanner, esto sirve para capturar datos
        Scanner scanner = new Scanner(System.in);

        //Imprime texto haciendo una pregunta
        System.out.print("Ingrese el nombre para la factura: ");
        //Captura el dato del usuario y se guarda en la variable
        String nombre = scanner.nextLine();

        //Imprime texto haciendo una pregunta
        System.out.print("Ingrese un precio de producto 1: ");
        //Captura el dato del usuario y se guarda en la variable.
        double precio1 = scanner.nextDouble();

        //Imprime texto haciendo una pregunta
        System.out.print("Ingrese un segundo precio de producto 2: ");
        //Captura el dato del usuario y se guarda en la variable
        double precio2 = scanner.nextDouble();

        //Bruto: Suma todos los productos
        double totalBruto = precio1 + precio2;
        //Impuesto: Multiplica totalBruto por un 19% o 0.19
        double impuesto = totalBruto * 0.19;
        //Neto: bruto + impuesto
        double totalNeto = totalBruto + impuesto;

        //Todos los datos en una variable
        String detalle = "La factura " + nombre + " tiene un total bruto de " + totalBruto
                + "\nCon un impuesto de " + impuesto
                + "\nY el monto después de impuesto es de " + totalNeto;

        //Imprime la variable
        System.out.println(detalle);
    }
}

/*¿Qué hace este programa?
* Primero le pide al usuario que ingrese un nombre que va a tener la factura
* Luego que el usuario ingrese el precio de 2 productos
*
* Hacemos operaciones matemáticas para sacar el Total Bruto, El impuesto o IVA y El total Neto
* Para finalmente mostrarlo en la consola */

/*La logia es bastante simple
* Solo pide 3 datos al usuario
* Hace una operation matemática, sumando los productos para sacar el bruto
* Hace una multiplicación de 0.19 para sacar el impuesto o IVA del 19%
* Y finalmente para el neto se suma el bruto con el impuesto

* Para finalmente mostrarlo en pantalla */