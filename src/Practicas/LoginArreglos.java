package Practicas;

import java.util.Scanner;

public class LoginArreglos {
    public static void main(String[] args) {
        /*Esta es una forma estática de declarar arreglos

        //Aquí en cada arreglo habilitamos 3 espacios
        String[] usernames = new String[3];
        String[] passwords = new String[3];

        //La posición 0 corresponde al espacio 1
        usernames[0] = "christian";
        passwords[0] = "123";

        //La posición 1 corresponde al espacio 2
        usernames[1] = "admin";
        passwords[1] = "1234";

        //La posición 2 corresponde al espacio 3
        usernames[2] = "pablo";
        passwords[2] = "12345";
         */

        //Forma dinámica de declarar arreglos

        String[] usernames = {"christian", "admin", "pablo"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner in = new Scanner(System.in);

        //Preguntas al usuario
        System.out.print("Ingrese un usuario valido: ");
        String u = in.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String p = in.nextLine();

        //El estado por defecto es, false
        boolean estado = false;

        //Definimos un for, la primera parte definimos la variable i
        //La segunda parte viene la condición: Mientras sea menor a la cantidad de elementos va a iterar
        //y cuando sea igual o mayor a la cantidad de elementos finaliza
        //Y la tercera parte es cuando a i le hacemos un post incremento

        //O sea que primero muestra, i y luego se incrementa, luego muestra el incremento y se vuelve a incrementar
        //Y asi sucesivamente hasta que se rompa el bucle

        for (int i = 0; i < usernames.length; i++) {

            //Mientras el valor se va a aumentando la variable i va aumentando
            //Y de esa forma va a recorrer el arreglo hasta que coincidan los datos
            //O deniegue el acceso

            if (usernames[i].equals(u) && passwords[i].equals(p)) {
                estado = true;
                //Con break es para salirnos del bucle
                //con el fin de que si ya se cumplió no se siga repitiendo para lograr salir del bucle
                break;
            }
        }

        if (estado) {
            System.out.println("Bienvenido usuario, ".concat(u).concat("!"));
        } else {
            System.out.println("El usuario o contraseña, ¡No son validos!");
            System.out.println("Lo sentimos, requiere autenticación");
        }


    }
}
