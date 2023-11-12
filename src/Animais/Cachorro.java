package Animais;

public class Cachorro extends Animal {

    static int numeroDeCachorros;

    private int tamanhoDoRabo;


    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        super(nome, cor, peso, estadoDeEspirito);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;


        numeroDeCachorros ++;
    }

    //MÉTODOS

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }



    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }


       public String pegar(){
        return "Bolinha";
    }



    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public void soar(){
        System.out.println("AU AU");
    }
}
