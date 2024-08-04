public class Retangulo {
    private double comprimento, largura;

    public Retangulo(){
        comprimento = 1.0;
        largura = 1.0;
    }

    public Retangulo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento(){
        return comprimento;
    }

    public double getLargura(){
        return largura;
    }

    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public double calculaArea(){
        return (getComprimento() * getLargura());
    }

    public double calculaPerimetro(){
        return (2*getComprimento() + 2*getLargura());
    }

    public void mostraArea(){
        System.out.printf("Area total: %.2f\n", calculaArea());
    }

    public void mostraPerimetro(){
        System.out.printf("Perimetro total: %.2f\n", calculaPerimetro());
    }

}
