package FlujosDeControl;

public class ForOmitiendoNamesArrayVariante {
    public static void main(String[] args) {
        String[] nombres = {"Christian", "Pepe", "Antonia", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        int count = nombres.length;

        for(int i = 0; i < count; i++ ){
            //Le decimos aqui que se va a saltar los siguientes nombres
            //Con la diferencia de que no importa como este escrito igual lo toma
            if(nombres[i].toLowerCase().contains("CHRisTIAN".toLowerCase()) ||
                    nombres[i].toLowerCase().contains("pePA".toLowerCase())){
                continue;
            }

            System.out.println(nombres[i]);
        }
    }
}
/*La salida será:
  Pepe
  Antonia
  Paco
  Lalo
  Bea
  Pato*/