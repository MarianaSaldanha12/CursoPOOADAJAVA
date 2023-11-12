package Animais;

public class Passaros extends Animal {

    static int numeroDePassaros;

    public Passaros(String nome, String cor, double peso, String estadoDeEspirito) {
        super(nome, cor, peso, estadoDeEspirito);
    }

    @Override
    public String toString() {
        return "Passaros{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public void soar(){
        System.out.println("PIU PIU");
    }
}
