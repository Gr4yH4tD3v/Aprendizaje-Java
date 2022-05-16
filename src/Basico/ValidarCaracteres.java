package Basico;

public class ValidarCaracteres {
    public static void main(String[] args) {

        //COMO VALIDAR CARACTERES

        //Variable que no tiene valor
        String curso = null;

        //Se guarda una pregunta: El valor de curso es igual a nulo?
        boolean esNulo = curso == null;

        //El resultado serie true ya que efectivamente no tiene valor
        System.out.println("El valor de curso es nulo? = " + esNulo);

        //Si la pregunta es true ejecuta lo que tiene dentro, si no ignora y sigue con lo demás
        if(esNulo == true) {
            //Le asignamos valor a curso
            curso = "Java";
        }

        //Guarda una pregunta: El largo de caracteres de curso es igual a cero?
        boolean esVacio = curso.length() == 0;

        //if (esVacio == false) o sea en una negación
        //Pero también se puede escribir de la siguiente forma
        //Si variable es igual a false ejecuta esto y efectivamente lo es
        if(!esVacio) {
            //Imprime un mensaje
            System.out.println("Programación " + curso);
        }
    }
}

/* Si no entendiste lo que pasó aquí, primero teníamos una variable que no tenía valor
* Luego validamos si tenía algún valor o no, si tenía valor, sigue adelante, pero si no tenía le asignamos uno
* Luego hicimos otra validación si el largo de caracteres
* Si el largo de la variable era igual a 0 se terminaba el programa si hacer nada
* Pero si el largo era mayor a 0 imprimía un mensaje con el valor asignado*/
