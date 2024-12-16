package TRANSPORTES;

public class Aereo extends Transportes {
    private double altitudeMaxima;

    public Aereo(int capacidade, double velocidadeMaxima, double altitudeMaxima  ){
        super(capacidade, velocidadeMaxima);
        this.altitudeMaxima   = altitudeMaxima ;
    }

    public void informacoes(){
        super.informacoes();
        System.out.printf("%n Altitude Maxima: %s %n",altitudeMaxima + " Pes");
    }
}
