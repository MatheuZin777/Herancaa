package TELL;

public class Dispositivo {
    private String marca;
    private String modelo;

    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void informacoes() {
        System.out.printf("%n Marca: %s %n Modelo: %s %n", marca , modelo);
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }
}
