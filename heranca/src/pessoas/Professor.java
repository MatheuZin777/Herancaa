package pessoas;

public class Professor extends Pessoa{
    private String disciplina;

    public Professor(String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public void apresentar(){
        super.apresentar();
        System.out.printf("%s Professor de Analise e Desenvolvimento de Sistemas \n", disciplina);
    }
}
