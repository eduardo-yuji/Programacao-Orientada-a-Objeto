package Exercicio2;

public abstract class Veiculo implements IVeiculo {
    private String nome;

    public Veiculo(String nome) {
        this.nome = nome;
    }

    public Veiculo() {
        this.nome = "";
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "nome = '" + nome + '\'' +
                '}';
    }
}
