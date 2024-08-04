public class TestaPontos2D {

    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D();
        Ponto2D p2 = new Ponto2D(3.5, 5.8);

        System.out.println("Numero de objetos criados: " + Ponto2D.getContador());

        System.out.println("Coordenadas de p1: ");
        System.out.printf("%.2f ", p1.getX());
        System.out.printf("%.2f", p1.getY());

        System.out.println();
        System.out.println("Coordenadas de p2: ");
        System.out.printf("%.2f ", p2.getX());
        System.out.printf("%.2f", p2.getY());

    }
}
