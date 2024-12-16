package MONEY;

public class Boleto extends Pagamento {
    private double desconto;

    public Boleto(double valor, double desconto) {
        super(valor);
        this.desconto = desconto;
    }

    public void realizarPagamento() {
        super.realizarPagamento();
        System.out.printf("%n Desconto de: %s ", desconto + "% Sob o valor pago via boleto");
    }
}
