public class TesteTurma {
    
    public static void main(String[] args) {

        Turma turma1 = new Turma();
        turma1.setCurso("Ciência da Computação");
        turma1.setDisciplina("POO I");

        Turma turma2 = new Turma();
        turma2.setCurso("Biologia");
        turma2.setDisciplina("Zoologia");

        turma1.printaDados();
        System.out.println();
        turma2.printaDados();

    }
}
