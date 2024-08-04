public class Turma {
    private String codTurma, estudante, disciplina;

    public Turma(String codTurma, String estudante, String disciplina){
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

}
