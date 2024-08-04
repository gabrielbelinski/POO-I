public class Main{
    public static void main(String[] args) {
        Palestra[] palestras = new Palestra[3];

        palestras[0] = new Palestra(Luz.VERMELHO);
        palestras[1] = new Palestra(Luz.AMBAR);
        palestras[2] = new Palestra(Luz.VERDE);

        for(Palestra p : palestras){
            p.acessa();
        }
    }
}