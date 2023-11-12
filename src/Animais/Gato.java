package Animais;

public class Gato extends Animal{

    static int numeroDeGatos;

    public Gato(String nome, String cor, double peso, String estadoDeEspiriito) {
        super(nome, cor, peso, estadoDeEspiriito);
    }


    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public void soar(){
        System.out.println("MIAU MIAU");
    }
}
