public class TurmaTeste {
    public static void main(String[] args) {
        Turma poo = new Turma("mcta018", "na2", 2);
        
        Aluno a1 = new Aluno("João", "da Silva", "12345");
        Aluno a2 = new Aluno("Maria", "Fernandes", "678910");

        poo.addMatricula(new Matricula(a1, 7));
        poo.addMatricula(new Matricula(a2, 10));

        //implementar a funcionalidade de adicionar uma nota na turma com base no ra
        // poo.setNota(ra, nota);

        //implementar o calculo da media da turma e incluir no relatório

        System.out.println(poo);
    }
}
