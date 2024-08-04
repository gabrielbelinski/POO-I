public class AppCarro
{
    public static void main(String [] args){
        Motor m1 = new Motor("3.8L V6");
        Bancos b1 = new Bancos("Marca tal");
        Carro c1 = new Carro("Mustang", "Convers�vel", "Ford",m1, b1);

        Motor m2 = new Motor("COOPER");
        Bancos b2 = new Bancos("Marca xis");


        Carro c2 = new Carro("MINI", "COOPER SE", "BMW", m2, b2);

        Motor m3 = new Motor("Mercedes-Benz");
        Bancos b3 = new Bancos("Marca ene");
        Carro c3 = new Carro("Mercedes-EQ", "EQA 250", "Mercedes-Benz", m3, b3);


        /* System.out.println( c1.getFabricante() + " " +
                c1.getMarca()      + " " +
                c1.getModelo()     + " " +
                c1.getTipoMotor()  + " " +
                c1.getFabricanteBanco()
        );

        System.out.println( c2.getFabricante() + " " +
                c2.getMarca()      + " " +
                c2.getModelo()     + " " +
                c2.getTipoMotor()  + " " +
                c2.getFabricanteBanco()
        );

        System.out.println( c3.getFabricante() + " " +
                c3.getMarca()      + " " +
                c3.getModelo()     + " " +
                c3.getTipoMotor()  + " " +
                c3.getFabricanteBanco()
        ); */


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
