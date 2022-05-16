package Basico;

public class CompararString {
    public static void main(String[] args) {
        //Este es un objeto
        String str1 = "Hola Christian";
        //Este es otro diferente
        String str2 = new String("Hola Christian");

        //Chequea si son el mismo objeto
        System.out.println(str1 + " y " + str2 + ", Son el mismo objeto?: " + (str1 == str2));
        //Es resultado dirá que son distintos, o sea 2 objetos diferentes
        //A pesar de que el contenido es el mismo

        //Chequea si tienen el mismo valor
        System.out.println(str1 + " Y " +  str2 + ", Tienen el mismo valor?: " + str1.equals(str2));
        //Se compara por valor, ya que va a verificar si tienen los mismos caracteres
        //Y en efecto, asi es


        //Otra forma de declara un String
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");

        //FORMA INCORRECTA DE COMPARAR UN STRING
        boolean esIgual = curso == curso2;
        System.out.println("\nesIgual compara la referencia, el objeto = " + esIgual);

        //FORMA CORRECTA DE COMPARAR UN STRING
        esIgual = curso.equals(curso2);
        System.out.println("equals compara el valor del String = " + esIgual);

        //FORMA CORRECTA DE COMPARAR UN STRING Y QUE IGNORE SI TIENE LA DIFERENCIA SON SOLO LAS MAYÚSCULAS

        //Exactamente la misma cadena, pero diferencias en las mayúsculas
        curso = "PROGRAMACIÓN DESDE JAVA";
        curso2 = "programación desde java";
        //Ambos String tienen los mismos caracteres
        esIgual = curso.equalsIgnoreCase(curso2);

        //El valor será true, ya que tienen el mismo valor
        System.out.println("\nLos string tienen los mismos caracteres a pesar de diferencias entre mayúsculas?: " + esIgual);
    }
}
