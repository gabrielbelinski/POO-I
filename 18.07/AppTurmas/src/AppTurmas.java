public class AppTurmas {
    public static void main(String[] args) {
        Turma[] turma = new Turma[3];
        turma[0] = new Turma("A", "Helena", "POOI");
        turma[1] = new Turma("A", "Igor", "POOI");
        turma[2] = new Turma("A", "Davi", "POOI");
        for (Turma turmas : turma) {
            System.out.println("Estudante: " + turmas.getEstudante()
                    + " está cursando a disciplina: " + turmas.getDisciplina()
                    + " na Turma " + turmas.getCodTurma());

        }
    }
}