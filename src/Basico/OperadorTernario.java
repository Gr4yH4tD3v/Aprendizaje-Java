package Basico;

public class OperadorTernario {
    public static void main(String[] args) {
        /*- Ternario significa que está formado por tres partes o tres elementos y este operador está formado
        por tres argumentos o partes donde evalúa una expresión booleana.

        - Entonces si se cumple esta condición va a devolver un valor y si no se cumple,
        devuelve otro valor pero siempre del mismo tipo.*/

        //Este operador es una versión simplificada del if -else
        // variable = condición ? "si es verdadero" : "si es falso";

        //EJEMPLO 1: Comparando valores

        //Caso de ser verdadero
        String variable = 7==7 ? "Si, es verdadero": "Si, es falso";

        //7 es igual a 7? Si, por lo tanto es (true)
        System.out.println("variable = " + variable);

        //Caso de ser falso

        variable = 7==5 ? "Si, es verdadero": "Si, es falso";

        //7 es igual a 5: no por lo tanto va a (false)
        System.out.println("variable = " + variable);

        //EJEMPLO 2: Reprobado o Rechazado

        String estado = "";
        double promedio = 3.0;

        //si promedio es mayor o igual a 4.0 está aprobado
        //de lo contrario está rechazado
        estado = promedio >= 4.0 ? "Aprobado": "Rechazado";
        System.out.println("estado = " + estado);

        //Esto es lo mismo que lo anterior
        //Solo que a comparación de este el anterior está más simplificado

        estado = "";
        promedio = 3.0;

        //si promedio es mayor o igual a 4.0 está aprobado
        //de lo contrario está rechazado

        if(promedio >= 4.0){
            System.out.println("Estado Aprobado" );
        }else{
            System.out.println("Estado Rechazado");
        }


    }
}
