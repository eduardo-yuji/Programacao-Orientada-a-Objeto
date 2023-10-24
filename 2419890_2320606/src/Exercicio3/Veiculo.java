package Exercicio3;

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

    public abstract int getRodas();
    public abstract int getJanelas();
    public abstract int getQtdeRadios();
    public abstract float getQtdeCombustivel();
    public abstract float getVelocidade();

    @Override
    public String toString() {
        return "Veiculo{" +
                "nome = '" + nome + '\'' +
                '}';
    }
}
