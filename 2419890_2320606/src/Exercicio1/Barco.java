package Exercicio1;

public class Barco extends Veiculo{
    private Integer qtdeCadeiras;
    private Integer qtdeMesas;

    public Barco(Integer qtdeCadeiras, Integer qtdeMesas, String nome) {
        super(nome);
        this.qtdeCadeiras = qtdeCadeiras;
        this.qtdeMesas = qtdeMesas;
    }

    public Barco() {
        this.qtdeCadeiras = 0;
        this.qtdeMesas = 0;
    }

    public Integer getQtdeCadeiras() {
        return this.qtdeCadeiras;
    }

    public void setQtdeCadeiras(Integer qtdeCadeiras) {
        this.qtdeCadeiras = qtdeCadeiras;
    }

    public Integer getQtdeMesas() {
        return this.qtdeMesas;
    }

    public void setQtdeMesas(Integer qtdeMesas) {
        this.qtdeMesas = qtdeMesas;
    }

    @Override
    public String toString() {
        return "Barco { " +
                "nome = " + getNome() +
                ", qtdeCadeiras = " + qtdeCadeiras +
                ", qtdeMesas = " + qtdeMesas +
                '}';
    }
}
