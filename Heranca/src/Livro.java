public class Livro extends Produto{

    private String autor;
    private int paginas;
    public Livro(int paginas, String autor, double preco, String nome) {
        super(nome, preco);
        this.paginas = paginas;
        this.autor = autor;
    }

    public boolean ehExtenso(){
        return this.paginas > 100;
    }
    public double getPrecoQtd(double qtd){
        return getPreco() * qtd;
    }

    @Override
    public boolean estaDisponivel(){
        return this.paginas < 2000;
    }


}
