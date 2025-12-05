public class Aluno extends Pessoa { // HERANÇA
    private String matricula;

    public Aluno(String nome, int idade, String matricula){
        super(nome, idade); // vem da classe Pessoa
        this.matricula = matricula;
    }

    public String getMatricula(){ return matricula; }
    public void setMatricula(String matricula){ this.matricula = matricula; }

    // polimorfismo → mesma função da classe Pessoa, porém diferente
    @Override
    public String mostrarInfo(){
        return "Aluno: " + getNome() + " | Idade: " + getIdade() + 
               " | Matrícula: " + matricula;
    }
}
