public abstract class Pessoa {
   
    private String nome;
    private int idade;



public Pessoa (String nome, int idade){

this.nome = nome;
this.idade = idade;

}

// getters e setters (ENCAPSULAMENTO)
    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome = nome; }

    public int getIdade(){ return idade; }
    public void setIdade(int idade){ this.idade = idade; }

    // método que pode ser sobrescrito → POLIMORFISMO
    public String mostrarInfo(){
        return "Nome: " + nome + " | Idade: " + idade;
    }
}