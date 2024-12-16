package MONEY;

public class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void realizarPagamento() {
        System.out.printf("%n%n Valor a pagar: %s ", valor);
    }

    public double getvalor() {
        return valor;
    }

    public void setvalor(double valor) {
        this.valor = valor;
    }
}
