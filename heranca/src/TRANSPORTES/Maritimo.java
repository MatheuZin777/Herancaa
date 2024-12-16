package TRANSPORTES;

public class Maritimo extends Transportes {
    private String tipoCasco;

    public Maritimo(int capacidade, double velocidadeMaxima, String tipoCasco){
        super(capacidade, velocidadeMaxima);
        this.tipoCasco = tipoCasco ;
    }

    public void informacoes(){
        super.informacoes();
        System.out.printf("%n Tipo do casco: %s %n",tipoCasco);
    }
}
