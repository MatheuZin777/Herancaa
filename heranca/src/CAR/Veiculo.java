package CAR;

public class Veiculo {
    private String modelo;
    private double capacidadeTank;

    public Veiculo(String modelo, double capacidadeTank){
        this.modelo = modelo;
        this.capacidadeTank = capacidadeTank;
    }

    public void exibirInformacoes(){
        System.out.printf("%n Modelo: %s %n Capacidade tanque: %s" + " Litros %n" , modelo, capacidadeTank);
    }


}
