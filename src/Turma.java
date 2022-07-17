import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String codDisciplina;
    private String codTurma;
    private int tamanho;
    private List<Matricula> matriculas;

    public Turma(String codDisciplina, String codTurma, int tamanho){
        this.codDisciplina = codDisciplina;
        this.codTurma = codTurma;
        setTamanho(tamanho);
        this.matriculas = new ArrayList<Matricula>();

    }

    private void setTamanho(int tamanho){
        if(tamanho < 0){
            throw new IllegalArgumentException("Tamanho must be greater or equals zero");
        }
        this.tamanho = tamanho;
    }

    public boolean cheia(){
        return matriculas.size() == tamanho;
    }

    public boolean temVagas(){
        return !cheia();
    }

    public void addMatricula(Matricula matricula){
        if(!temVagas()){
            System.err.println("capacidade da turma excedida");
        }
        else{
            this.matriculas.add(matricula);
        }
    }

    private String buildRelatorioTurma(){
        StringBuilder builder = new  StringBuilder();

        builder.append("Disciplina: " + codDisciplina + "\n");
        builder.append("Turma: " + codTurma + "\n");
        System.out.println();
        builder.append(String.format("%-10s", "RA"));
        builder.append(String.format("%-30s", "Nome"));
        builder.append(String.format("%-7s", "Nota"));
        builder.append("\n");

        for(Matricula matricula : matriculas){
            builder.append(String.format("%-10s", matricula.getAluno().getRa()));
            builder.append(String.format("%-30s", matricula.getAluno().getNome()
             + " " + matricula.getAluno().getSobreome()));
            builder.append(String.format("%-7.2f", matricula.getNota()));
            builder.append("\n");
        }
        builder.append("\n");

        return builder.toString();
    }

    public String toString(){
        return buildRelatorioTurma();
    }
}
