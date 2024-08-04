public class ExemploAviao {
    public static void main(String[] args) {
        Aviao aviaoI = new Aviao();

        aviaoI.fabricante = "Boeing";
        aviaoI.modelo = "777";
        aviaoI.qtdeAssentos = 368;

        aviaoI.ligar();
    }
}
