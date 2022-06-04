package FlujosDeControl;

public class EjemploDoWile {
    public static void main(String[] args) {
        int i = 1;
        boolean prueba = true;

        do {
            if (i == 10){
                prueba = false;
            }
            System.out.println("Se ejecuta " + i + " veces");
            i++;
        }while (prueba);
    }
}
/*La salida va a ser:
Se ejecuta 1 veces
Se ejecuta 2 veces
Se ejecuta 3 veces
Se ejecuta 4 veces
Se ejecuta 5 veces
Se ejecuta 6 veces
Se ejecuta 7 veces
Se ejecuta 8 veces
Se ejecuta 9 veces
Se ejecuta 10 veces*/