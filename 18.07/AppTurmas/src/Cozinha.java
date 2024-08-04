public class Cozinha {

    private Geladeira geladeira = new Geladeira();
    private Liquidificador liquidificador = new Liquidificador();
    private Microondas microondas = new Microondas();

    public void ligar(){
        geladeira.ligar();
        liquidificador.ligar();
        microondas.ligar();
    }

    public void desligar(){
        geladeira.desligar();
        liquidificador.desligar();
        microondas.desligar();
    }

    public void observar(){
        geladeira.observar();
        liquidificador.observar();
        microondas.observar();
    }
}
