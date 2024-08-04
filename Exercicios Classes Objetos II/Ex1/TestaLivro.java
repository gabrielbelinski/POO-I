public class TestaLivro {
    public static void main (String[] args) {
        Livro livro1 = new Livro();
        livro1.setAutor("Fernando Pessoa");
        livro1.setTitulo("Navegar é preciso");

        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());

        livro1.exibeDados();
    }
}
