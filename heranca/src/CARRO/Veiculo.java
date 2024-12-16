package CARRO;

public class Veiculo {
    private String marca;
    private int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.printf("%n Marca: %s %n Ano:  %d %n", marca , ano);
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public double getano() {
        return ano;
    }

    public void setano(int ano) {
        this.ano = ano;
    }
}
