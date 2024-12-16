package pessoas;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.printf(" nome: %s %n idade: %d %n", nome , idade );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getidade() {
        return idade;
    }

    public void setNome(int idade) {
        this.idade = idade;
    }

}
