public class MatriculaTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João", "da Silva", "12345");
        Aluno a2 = new Aluno("Maria", "Fernandes", "678910");

        Matricula m1 = new Matricula(a1, 10);
        Matricula m2 = new Matricula(a2, 7);

        System.out.println(m1);
        System.out.println(m2);
    }
}
