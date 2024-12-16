package TRANSPORTES;

public class Transportes {
    private int capacidade;
    private double velocidadeMaxima;

    public Transportes(int capacidade, double velocidadeMaxima) {
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void informacoes() {
        System.out.printf("%n Capacidade de pessoas: %s %n Velocidade Maxima:  %s" + " Km/h", capacidade , velocidadeMaxima);
    }

    public int getcapacidade() {
        return capacidade;
    }

    public void setmarca(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getvelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setmodelo(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
