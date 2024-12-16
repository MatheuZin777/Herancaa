package CARRO;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, int ano, int numPortas){
        super(marca, ano);
        this.numPortas = numPortas;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.printf(" Numero de portas: %s %n \n", numPortas);
    }
}
