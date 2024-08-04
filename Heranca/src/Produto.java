public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public boolean ehCaro(){
        return this.preco > 50.0;
    }

    public double getPreco(){
        return this.preco;
    }

    public double getPrecoQtd(){
        return this.preco * 1;
    }

    public boolean estaDisponivel(){
        return true;
    }

}
