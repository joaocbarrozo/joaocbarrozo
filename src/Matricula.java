public class Matricula {
    private Aluno aluno;
    private float nota;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota){
        if(nota < 0 || nota > 10){
            throw new IllegalArgumentException("nota must be in [0 - 10]");
        }
        this.nota = nota;
    }

    public Matricula (Aluno aluno){
        this.aluno = aluno;
        setNota(0);
    }

    public Matricula (Aluno aluno, float nota){
        this.aluno = aluno;
        setNota(nota);
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Aluno: " + this.aluno + "\n")
        .append("Nota: " + this.nota + "\n");

        return builder.toString();
    }    
}
