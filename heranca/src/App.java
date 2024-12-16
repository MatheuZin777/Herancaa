import CAR.*;

public class App {
    public static void main(String[] args) throws Exception {
        Carro $$$ = new Carro("Sedã",65,16);
        
        Caminhao $$ = new Caminhao("Carreta",1.750,12664);
        
        Moto $$$$ = new Moto("Carenada",12,"AP TURBO");


        $$$.exibirInformacoes();
        $$.exibirInformacoes();
        $$$$.exibirInformacoes();
    }
}
