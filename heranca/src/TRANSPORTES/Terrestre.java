package TRANSPORTES;

public class Terrestre extends Transportes {
    private String tipoCombustivel  ;

    public Terrestre(int capacidade, double velocidadeMaxima, String tipoCombustivel  ){
        super(capacidade, velocidadeMaxima);
        this.tipoCombustivel   = tipoCombustivel ;
    }

    public void informacoes(){
        super.informacoes();
        System.out.printf("%n Tipo de Combustivel: %s %n",tipoCombustivel  );
    }

    public String gettipoCombustivel(){
        return tipoCombustivel  ;
    }

    public void setcilindradas (String tipoCombustivel){
        this.tipoCombustivel  = tipoCombustivel ;
    }
}
