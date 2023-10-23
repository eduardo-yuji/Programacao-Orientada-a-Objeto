package Exercicio2;

public class Barco extends Veiculo {
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

    public float emitirPassagem() {
        return 2000f;
    }

    public float calcularPagamento(Integer distancia, float taxa) {
        return 200 * distancia + taxa;
    }

    public float calcularTempoViagem(Integer x1, Integer x2, Integer y1, Integer y2) {
        return 20 * (float) (Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2),2)));
    }
}
