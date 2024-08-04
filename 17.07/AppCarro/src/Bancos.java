public class Bancos {
    private String fabricante;

    public Bancos(String fabricante){
        this.fabricante = fabricante;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    @Override
    public String toString(){
        return this.fabricante;
    }
}
