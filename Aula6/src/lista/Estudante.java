package lista;

public class Estudante {
    private String nome;
    private int idade;
    private String CPF;
    
    public Estudante(String nome){
          this.nome = nome;
    }
    public Estudante(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
    public Estudante(String nome, int idade, String CPF){
        this.nome=nome;
        this.idade=idade;
        this.CPF=CPF;
    }
    
    public String toString(String nome){
        return "Nome: " + this.nome;
    }
    
    public String toString(int idade){
        return "Idade: " + this.idade;
    }
    
    public String toString(String nome, int idade){
        return "Nome: " + this.nome + "\nIdade: " + this.idade;
    }
    
    public String toString(String nome, int idade, String CPF){
        return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nCPF: " + this.CPF;
    }
}
