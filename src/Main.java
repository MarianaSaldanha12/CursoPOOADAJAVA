import Animais.Cachorro;

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


        Cachorro cachorro2 = new Cachorro("Puppy", "Marrom", 25, 5.5, 5, "carinho");

        System.out.println(cachorro2.getNumeroDeCachorros());

        Cachorro cachorro1 = new Cachorro("Rex", "Preto", 20, 6, 6, "latir");

        System.out.println(cachorro2.getNumeroDeCachorros());
    }
}