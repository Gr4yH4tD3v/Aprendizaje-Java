package Practicas;

import java.util.Scanner;

public class LoginOpLogicos {
    public static void main(String[] args) {

        //Datos del sistema
        String username = "christian";
        String password = "12345";

        String username2 = "admin";
        String password2 = "12345";

        //Preguntas al usuario
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un usuario valido: ");
        String u = in.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String p = in.nextLine();

        //Estado de autenticacion debe estar en false
        boolean estado = false;

        //condición que evalúa si los datos son correctos o no
        //username.equals(u) es lo mismo que decir los valores de username y u son iguales
        //usamos el operador &&, ya que usuario y contraseña deben ser válidos
        //y la condición que sigue es lo mismo que username y u pero en el contexto de las contraseñas

        if (username.equals(u) && password.equals(p) || (username2.equals(u) && password2.equals(p))) {
            estado = true;
        } else {
            System.out.println("El usuario o contraseña, ¡No son validos!");
        }

        //esto se cumple si estado es true
        if (estado) {
            System.out.println("Bienvenido usuario, ".concat(u).concat("!"));
        } else {
            System.out.println("Lo sentimos, requiere autenticación");
        }


    }
}
