package TELL;

public class Celular extends Dispositivo {
    private String sistemaOperacional ;

    public Celular(String marca, String modelo, String sistemaOperacional ){
        super(marca, modelo);
        this.sistemaOperacional  = sistemaOperacional ;
    }

    public void informacoes(){
        super.informacoes();
        System.out.printf(" Sistema Operacional do Dispositivo : %s %n",sistemaOperacional );
    }

    public String getsistemaOperacional (){
        return sistemaOperacional ;
    }

    public void setcilindradas (String sistemaOperacional){
        this.sistemaOperacional = sistemaOperacional;
    }
}
