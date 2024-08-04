public class TestaRetangulo {

    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo(3, 5);


        System.out.println("R1");
        r1.mostraArea();
        r1.mostraPerimetro();
        System.out.println("R2");
        r2.mostraArea();
        r2.mostraPerimetro();

    }
}
