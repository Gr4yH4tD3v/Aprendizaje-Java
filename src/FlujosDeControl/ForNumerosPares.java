package FlujosDeControl;

public class ForNumerosPares {
    public static void main(String[] args) {
        //Empezamos de 2 porque 0 ni 1 son pares
        for (int i = 2; i <= 10; i++) {
            if (i % 2 != 0) {
                //hacemos uso de la negación si es verdadero va a ser falso (invierte)
                //e imprime el número par

                //continue hace que se salga del contexto
                continue;
            }

            System.out.println("i = " + i);
        }
    }
}
/*El resultado será este:
* i = 2
  i = 4
  i = 6
  i = 8
  i = 10
*/