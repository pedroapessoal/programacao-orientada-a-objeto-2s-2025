public class Curso {
    private String nomeCurso;
    private int duracao;

    public Curso(String nomeCurso, int duracao){
        this.nomeCurso = nomeCurso;
        this.duracao = duracao;
    }

    public String getNomeCurso(){ return nomeCurso; }
    public int getDuracao(){ return duracao; }

    public String mostrarCurso(){
        return "Curso: " + nomeCurso + " (" + duracao + " meses)";
    }
}
