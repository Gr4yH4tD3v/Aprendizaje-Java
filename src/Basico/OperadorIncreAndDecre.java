package Basico;

public class OperadorIncreAndDecre {
    public static void main(String[] args) {

        //Pre Incremento
        int a = 1;
        //El valor a se incrementa en 1 y se asigna a la variable b
        int b = ++a;
        //Imprime valor de la variable
        System.out.println("Pre incremento b = " + b);

        //Pre Decremento
        a = 5;
        //El valor disminuye en 1 y se asigna a la variable b
        b = --a;

        System.out.println("Pre decremento b = " + b);

        //Post Incremento
        a = 9;
        //El valor primero se asigna y después se incrementa
        b = a++;

        //El valor nueve se asignó primero
        System.out.println("Post incremento b antes de incrementar = " + b);

        //Luego incrementó
        System.out.println("Post incremento a después de incrementar = " + a);

        //Post Incremento
        a = 9;
        //El valor primero se asigna y después se decrementa
        b = a--;

        //El valor nueve se asignó primero
        System.out.println("Post decremento b antes de incrementar =  = " + b);
        //Luego decrementó
        System.out.println("Post decremento a después de incrementar = " + a);


    }
}
