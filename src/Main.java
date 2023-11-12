import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaros;
import Lojas.PetShop;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello, World!");

       // byte variavelByte = 127;
        //short -32768 a 32767
        //char  0 a 65535
        //int -2b a 2b
        //long -9t a 9t
       // int variavelInt = 2147483;
       // System.out.println(variavelInt);



        Cachorro cachorro1 = new Cachorro("Rex", "Preto", 20, 6, 6, "latir");

        Gato gato1 = new Gato("Felix", "Laranja", 4.5, null);

        Passaros passaros1 = new Passaros("Frajola", "Azul", 0.5, null);

        cachorro1.soar();
        gato1.soar();
        passaros1.soar();

        PetShop petshop = new PetShop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        petshop.deixarNoHotel(passaros1);
        System.out.println(passaros1.getEstadoDeEspirito());
    }
}