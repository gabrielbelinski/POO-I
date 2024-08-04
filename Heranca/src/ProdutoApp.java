public class ProdutoApp {
    public static void main(String[] args){
        Livro l1 = new Livro(200, "Fulano", 29.9, "Auto-ajuda");
        Livro l2 = new Livro(3200, "Silva", 900.0, "Guia de java");

        if(l1.ehExtenso()){
            System.out.println("O livro l1 eh extenso");
        }
        else{
            System.out.println("O livro l1 nao eh extenso");
        }

        if(l1.ehCaro()){
            System.out.println("O livro l1 eh caro");
        }
        else{
            System.out.println("O livro l1 nao eh caro");
        }

        if(l1.estaDisponivel()){
            System.out.println("O livro l1 esta disponivel");
        }
        else{
            System.out.println("O livro l1 nao esta disponivel");
        }

        if(l2.ehExtenso()){
            System.out.println("O livro l2 eh extenso");
        }
        else{
            System.out.println("O livro l2 nao eh extenso");
        }

        if(l2.ehCaro()){
            System.out.println("O livro l2 eh caro");
        }
        else{
            System.out.println("O livro l2 nao eh caro");
        }

        if(l2.estaDisponivel()){
            System.out.println("O livro l2 esta disponivel");
        }
        else{
            System.out.println("O livro l2 nao esta disponivel");
        }
    }
}
