package FlujosDeControl;

import javax.swing.*;

public class BuscandoNamesEspecificosArrayFor {

    public static void main(String[] args) {
        // Arreglo de nombres
        String[] nombres = {"Christian", "Pepe", "Antonia", "Paco", "Lalo", "Bea", "Pato", "Pepa"};

        // Contar los valores del arreglo
        int count = nombres.length;

        // Imprime todos los nombres del arreglo
        for (int i = 0; i < count; i++) {
            System.out.println(nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre \"Pepe\" o \"Maria\": ");
        boolean encontrado = false;

        //Busca los nombres que introdujo el usuario
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
        }
        //Aquí vemos si el usuario esta o no
        if (encontrado) {
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema");
        }
    }

}

/*Que hace este programa:
* Lo que hace es dar la opción de buscar un nombre de los que están predefinidos
* En un array, si existe devolvera que ese nombre fue encontrado
* Si no encuentra ese nombre devolvera que no lo encontró*/
