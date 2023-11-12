package Lojas;

import Animais.Animal;
import Animais.Cachorro;


public class PetShop {

    public void darBanho(Animal animal){
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(Cachorro cachorro){
        cachorro.setEstadoDeEspirito("Bonito");
    }

    public void deixarNoHotel(Animal animal){
        animal.setEstadoDeEspirito("Triste");
    }

}
