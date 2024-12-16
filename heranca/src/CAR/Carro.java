package CAR;

public class Carro extends Veiculo {
    private double consumoPorKm;

    public Carro(String modelo, double capacidadeTank,double consumoPorKm ){
        super(modelo, capacidadeTank);
        this.consumoPorKm = consumoPorKm;
    }

    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.printf(" Consumo por km: %s %n", consumoPorKm);
    }
}
