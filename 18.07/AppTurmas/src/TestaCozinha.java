public class TestaCozinha {

    public static void main(String[] args){
        Cozinha cozinha = new Cozinha();

        System.out.println("Ligando...");
        cozinha.ligar();
        cozinha.observar();

        System.out.println("Desligando...");
        cozinha.desligar();
        cozinha.observar();
    }
}
