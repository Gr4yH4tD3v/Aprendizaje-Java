package FlujosDeControl;

public class ForOmitiendoNombresArreglo {
    public static void main(String[] args) {
        //Definimos arreglo
        String[] nombres = {"Christian", "Pepe", "Antonia", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        //Cuenta los espacios del arreglo
        int count = nombres.length;

        for(int i = 0; i < count; i++ ){
            //Le decimos aqui que se va a saltar christian o pepa
            if(nombres[i].equalsIgnoreCase("christian") || nombres[i].equalsIgnoreCase("pepa")){
                //Si el nombre coincide se vuelve a repetir
                continue;
            }
            //Imprime la posición actual del arreglo
            System.out.println(nombres[i]);
        }
    }
}

/*EL programa tiene como fin imprimir nombres de un arreglo
* Pero saltándose 2 nombres en específico de los que ya están declarados
* christian y pepa
* Por lo tanto la salida será:
 Pepe
 Antonia
 Paco
 Lalo
 Bea
 Pato*/