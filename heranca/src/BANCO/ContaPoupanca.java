package BANCO;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeJuros;

    public ContaPoupanca(String numero, double saldo, double taxaDeJuros){
        super(numero, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.printf(" Taxa de juros: %s %n \n", taxaDeJuros + " Por mes ");
    }
}

