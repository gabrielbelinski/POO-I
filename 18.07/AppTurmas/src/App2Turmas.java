public class App2Turmas {
    public static void main(String[] args) {
        Turma2[] turma = new Turma2[3];
        turma[0] = new Turma2("B", "Ana", "POOI");
        turma[1] = new Turma2("B", "Oto", "POOI");
        turma[2] = new Turma2("B", "Theo", "POOI");
        for (Turma2 turmas : turma) {
            System.out.println(turmas);

        }
    }
}