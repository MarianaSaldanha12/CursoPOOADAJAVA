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

        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Puppy";
        cachorro1.cor = "Marrom";
        cachorro1.altura = 25;
        cachorro1.peso = 5.5;
        cachorro1.tamanhoDoRabo = 5;

        cachorro1.latir();
        System.out.println("O cachorro pegou uma "+cachorro1.pegar());
        System.out.println("O cachorro está " +cachorro1.interagir("Vai dormir!"));

    }
}