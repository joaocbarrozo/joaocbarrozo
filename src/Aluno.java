public class Aluno{
    private String nome;
    private String sobrenome;
    private String ra;

    public Aluno(String nome, String sobrenome, String ra){
        setNome(nome);
        this.sobrenome = sobrenome;
        setRa(ra);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if(nome.split(" ").length > 1){
            throw new IllegalArgumentException("nome must be a single word");
        }
        this.nome  = nome;
    }
    public String getSobreome(){
        return sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome  = sobrenome;
    }
    public String getRa(){
        return ra;
    }
    /**
     * Setter for student RA
     * @param ra the RA
     */
    public void setRa (String ra){
        if(!ra.matches("\\d+")){
            throw new IllegalArgumentException("RA must be a number");
        }
        this.ra = ra;
    }



    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Nome: " + this.nome + "\n")
        .append("Sobrenome: " + this.sobrenome + "\n")
        .append("RA: " + this.ra + "\n");

        return builder.toString();
    }
}