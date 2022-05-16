package Basico;

public class ValidarString {
    public static void main(String[] args) {
        //EJEMPLO 1: Verificar si tiene algún valor

        //String con valor nulo o sea que no tiene referencia está vacío
        String curso = null;

        //Guarda una comparación curso es igual a null?
        boolean esNulo = curso == null;

        //Obviamente es nulo por lo tanto es true
        System.out.println("El valor de curso es nulo? = " + esNulo);

        //EJEMPLO 2: Que pasa si intentamos hacer algo con un valor null

        // Si intentamos correr la línea de abajo, él programa se rompe,
        // ya que está llamado a algo que no tiene valor
        //Intenta descomentarla para probar que pasa si no me crees

        //System.out.println(curso.toUpperCase());

        //Aunque podríamos usar un if para que el programa decida si se debe imprimir o no

        //EJEMPLO 3: Como evitar el Exception si intentamos hacer algo con el valor nulo

        //If es si pasa esto se ejecuta lo que esté dentro
        //Ya sabemos que es true, pero si es false o sea si tiene algún valor
        //Ejecuta el código y convertiría a mayúscula un String (ahora es null, pero si tuviera "hola" seria "HOLA")
        //La idea principal es que tengamos esta línea, pero que no lance la Exception o el error

       //Evita la Exception mientras en valor es nulo
        if(esNulo == false)
            //Intenta convertir el valor de la variable a mayúscula
            //Si no tiene nada para convertir da un error
            System.out.println(curso.toUpperCase());

        //EJEMPLO 4: Que pasa si concatenamos con operador + el valor null

        //Lo curioso es no da error e igual concatena a pesar de ser un valor nulo
        System.out.println("Bienvenido a " + curso);

        //EJEMPLO 5: Como hacemos para imprimir un mensaje cambiando el valor de nulo a algún valor

        //Le asignamos un valor al valor nulo
        curso = "Java";

        //Y finalmente va a imprimir un mensaje
        System.out.println("Bienvenido a " + curso);
    }
}
