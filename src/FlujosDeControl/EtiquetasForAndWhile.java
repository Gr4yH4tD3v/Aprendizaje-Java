package FlujosDeControl;

public class EtiquetasForAndWhile {
    public static void main(String[] args) {
        //Las etiquetas en los bucles nos permiten controlar con continue o break algún bucle en específico

        //EJEMPLO 1: NO hacemos uso de etiqueta
        for (int i = 0; i < 5; i++) {
            //Si i es igual a 2 se salta el 2
            if (i == 2) {
                continue;
            }
            System.out.println("i = " + i);

        }
        //EJEMPLO 2: Aqui hacemos uso de etiquetas
        //bucle1 es una etiqueta
        bucle1: for (int i = 0; i < 5; i++) {
            //Si i es igual a 2 se salta el 2
            if (i == 2) {
                //Tiene el mismo resultado de que ejemplo 1
                continue bucle1;
            }
            System.out.println("i = " + i);
        }

        //EJEMPLO 3:

        /*Explicación: Básicamente lo que hace esto es primeramente
         * Crear un bucle for que tiene la variable i
         * Empieza desde 0, pero antes de seguir iterando entra en otro bucle
         * Por lo tanto este llega hasta el valor 4 y se sale
         * En esas 4 iteraciones i se mantiene en 0
         * Mientras eso ocurre se van imprimiendo los valores de i y j
         * Luego i incrementa en uno i hace lo mismo
         * La gracia está en que se salta el 2 e i automáticamente vale 3
         * en lugar de 2 y la etiqueta hace que se salga del bucle 1 etiquetado
         * en vez de salirse solo del bucle j*/

        //bucle1 es una etiqueta
        bucle1:

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {

                if (i == 2) {

                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }

        //EJEMPLO 4:
        /*Explicación: Básicamente lo que hace esto es primeramente
         * Crear un bucle for que tiene la variable i
         * Empieza desde 0, pero antes de seguir iterando entra en otro bucle
         * Por lo tanto este llega hasta el valor 4 y se sale completamente*/

        //bucle1 es una etiqueta
        bucle1:

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {

                if (i == 2) {
                    //Tiene el mismo resultado de que ejemplo 1
                    break bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }

        //EJEMPLO 5

        bucle1:
        for (int i = 1; i < 5; i++) {
            int j = 0;
            while (j <= 5){
                if (i == 4 || i == 5){
                    System.out.println("Dia " + i + ": descanso de fin de semana!");
                    continue bucle1;
                }
                System.out.println("Dia " + i + ", trabajando a las " + j + "hrs. ");
                j++;
            }
        }
    }
}
