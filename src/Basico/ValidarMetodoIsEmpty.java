package Basico;

public class ValidarMetodoIsEmpty {
    public static void main(String[] args) {


        //COMO VALIDAR CARACTERES CON METODO isEmpty

        //Variable que no tiene valor
        String curso = null;

        //Se guarda una pregunta: El valor de curso es igual a nulo?
        boolean esNulo = curso == null;

        //El resultado serie true ya que efectivamente no tiene valor
        System.out.println("El valor de curso es nulo? = " + esNulo);

        //Si la pregunta es true ejecuta lo que tiene dentro, si no ignora y sigue con lo demás
        if (esNulo == true) {
            //Le asignamos valor a curso
            curso = "Java";
        }

        //Método isEmpty verifica si la variable curso esta vacía, si lo estuviera seria true
        //En este caso le asignamos un valor asi que es false
        boolean esVacio = curso.isEmpty();

        //if (esVacio == false) o sea en una negación
        //Pero también se puede escribir de la siguiente forma
        //Si variable es igual a false ejecuta esto y efectivamente lo es
        if (!esVacio) {
            //Imprime un mensaje
            System.out.println("Programación " + curso);
        }
    }

}


/* Si no entendiste lo que pasó aquí, primero teníamos una variable que no tenía valor
 * Luego validamos si tenía algún valor o no, si tenía valor, sigue adelante, pero si no tenía le asignamos uno
 * Luego hicimos otra validación con el método isEmpty que si verifica si la variable esta vacia o no
 * Si tiene algún valor devuelve false, si no tiene ningún valor devuelve true
 * Por lo tanto si la variable estaba vacía se terminaba el programa si hacer nada
 * Pero como teníamos caracteres imprimía un mensaje con el valor asignado*/

/*is Empty solo comprueba si la cadena esta vacía si ya tiene algún espacio dará false

         StringUtils.isEmpty(null)      = true
         StringUtils.isEmpty("")        = true
         StringUtils.isEmpty(" ")       = false
         StringUtils.isEmpty("bob")     = false
         StringUtils.isEmpty("  bob  ") = false
*/
/*También se podría usar is Blank comprueba si la cadena es un espacio en blanco o si esta vacía o es nula,
    este método seria el mas indicado para verificar algún String

             StringUtils.isBlank(null)      = true
             StringUtils.isBlank("")        = true
             StringUtils.isBlank(" ")       = true
             StringUtils.isBlank("bob")     = false
             StringUtils.isBlank("  bob  ") = false
*/