public class Turma2 {
    private String codTurma, estudante, disciplina;

    public Turma2(String codTurma, String estudante, String disciplina){
        this.codTurma = codTurma;
        this.estudante = estudante;
        this.disciplina = disciplina;
    }

    public String getEstudante(){
        return this.estudante;
    }

    public String getDisciplina(){
        return this.disciplina;
    }

    public String getCodTurma(){
        return this.codTurma;
    }

    @Override
    public String toString(){
        return "Estudante: " + getEstudante() + " está cursando a disciplina: " + getDisciplina() + " na Turma " + getCodTurma();

    }

}
