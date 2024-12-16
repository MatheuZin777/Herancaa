package CAR;

public class Moto extends Veiculo{
    private String tipoMotor;

    public Moto(String modelo, double capacidadeTank,String tipoMotor){
        super(modelo, capacidadeTank);
        this.tipoMotor = tipoMotor;
    }

    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.printf(" Tipo do motor: %s %n", tipoMotor );
    }
}
