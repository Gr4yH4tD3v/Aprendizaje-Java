package Practicas;
//Importando librería Scanner
import java.util.Scanner;

public class EstadoEstudianteTernario {
    public static void main(String[] args) {

        //Creando objeto Scanner
        Scanner s = new Scanner(System.in);

        //Definiendo variables
        String estado = ""; double promedio = 0.0; double matematicas = 0.0; double ciencias = 0.0; double historia = 0.0;

        //Preguntas al usuario y guardando los datos en variables
        System.out.print("Ingrese la nota de matemáticas entre 2.0 - 7.0: ");
        matematicas = s.nextDouble();
        System.out.print("Ingrese la nota de ciencias entre 2.0 - 7.0: ");
        ciencias = s.nextDouble();
        System.out.print("Ingrese la nota de historia entre 2.0 - 7.0: ");
        historia = s.nextDouble();

        //Operación para sacar el promedio
        promedio = (matematicas + ciencias + historia) / 3;

        //Haciendo uso del operador ternario que es como una abreviación del if - else
        estado = promedio >= 4.0 ? "Aprobado" : "Rechazado";

        //Imprimiendo el estado
        System.out.println("Tu estado es: " + estado);
    }
}


