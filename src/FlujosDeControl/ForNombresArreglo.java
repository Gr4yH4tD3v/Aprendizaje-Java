package FlujosDeControl;

public class ForNombresArreglo {
    public static void main(String[] args) {
        //creamos un arreglo de nombres
        String[] nombres = {"Christian", "Pepe", "Antonia", "Paco", "Lalo", "Bea", "Pato", "Pepa"};

        // El arreglo podría crecer de manera dinámica por eso el método length
        // cuenta los elementos de una variable y devuelve un entero
        // y esto cuenta cuantos nombres hay en el arreglo
        int count = nombres.length;

        for(int i = 0; i < count; i++ ){
            //imprime la posición del arreglo
            System.out.println(nombres[i]);
        }
    }
}

/*El resultado será este:
 Christian
 Pepe
 Antonia
 Paco
 Lalo
 Bea
 Pato
 Pepa
*/