package BANCO;

public class ContaCorrente extends ContaBancaria{
    private double limite;

    public ContaCorrente(String numero, double saldo, double limite){
        super(numero, saldo);
        this.limite = limite;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.printf(" Limite da conta: %s %n",limite);
    }

    public double getlimite(){
        return limite;
    }

    public void setlimite(double limite){
        this.limite = limite;
    }
}
