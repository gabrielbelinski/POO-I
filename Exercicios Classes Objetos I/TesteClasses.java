public class TesteClasses {

    public static void main(String[] args) {

        Universidade u = new Universidade();
        Aluno b = new Aluno();
        
        u.nome = "Unicentro";
        u.cidade = "Guarapuava";
        u.estado = "PR";
        
        b.nome = "Gabriel";
        b.curso = "Ciencia da Computacao";

        u.exibeDados();
        b.exibeDados();
    }
}
