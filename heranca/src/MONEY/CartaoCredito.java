package MONEY;

public class CartaoCredito extends Pagamento {
    private double taxa;

    public CartaoCredito(double valor, double taxa) {
        super(valor);
        this.taxa = taxa;
    }

    public void realizarPagamento() {
        super.realizarPagamento();
        System.out.printf("%n Uma taxa de: %s", taxa + "% foi aplicada no pagamento via cartao de credito");
    }



}
