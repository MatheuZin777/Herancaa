package TELL;

public class Laptop extends Dispositivo {
    private String memoriaRAM;

    public Laptop(String marca, String modelo, String memoriaRAM){
        super(marca, modelo);
        this.memoriaRAM = memoriaRAM;
    }

    public void informacoes(){
        super.informacoes();
        System.out.printf(" Memoria RAM: %s %n \n", memoriaRAM);
    }
}
