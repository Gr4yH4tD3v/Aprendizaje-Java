package FlujosDeControl;

public class ForeachEj2 {
    public static void main(String[] args) {
        //Definimos un arreglo de String
        String[] nombres = {"Christian", "Pepe", "Antonia", "Paco", "Lalo", "Bea", "Pato", "Pepa"};

        //nombres por cada iteracion asigna el valor a la variable String nombre
        for (String nombre : nombres) {

            //Imprime el valor de la variable nombre
            System.out.println("nombre = " + nombre);
        }

    }
}

/*El resultado de esto es el siguiente:
* nombre = Christian
  nombre = Pepe
  nombre = Antonia
  nombre = Paco
  nombre = Lalo
  nombre = Bea
  nombre = Pato
  nombre = Pepa*/