package CAR;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String modelo, double capacidadeTank,double capacidadeCarga ){
        super(modelo, capacidadeTank);
        this.capacidadeCarga = capacidadeCarga;
    }

    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.printf(" Capacidade de carga: %s %n", capacidadeCarga);
    }
}
