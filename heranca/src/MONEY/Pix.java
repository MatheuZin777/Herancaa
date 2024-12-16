package MONEY;

public class Pix extends Pagamento {
    private double transferencia;

    public Pix(double valor, double transferencia) {
        super(valor);
        this.transferencia = transferencia;
    }

    public void realizarPagamento() {
        super.realizarPagamento();
        System.out.printf("%n Valor de transferencia a vista: %s  ", transferencia);
    }


}
