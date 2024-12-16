package CARRO;

public class moto extends Veiculo {
    private int cilindradas;

    public moto(String marca, int ano, int cilindradas ){
        super(marca, ano);
        this.cilindradas  = cilindradas ;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.printf(" Cilindradas : %s %n",cilindradas );
    }

    public int getcilindradas (){
        return cilindradas ;
    }

    public void setcilindradas (int cilindradas){
        this.cilindradas = cilindradas;
    }
}
