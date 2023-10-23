package Exercicio4;

public class Onibus extends Veiculo {
    private Integer qtdePassageiros;
    private String tipo;

    public Onibus(int qtdePassageiros, String tipo, String nome) {
        super(nome);
        this.qtdePassageiros = qtdePassageiros;
        this.tipo = tipo;
    }

    public Onibus() {
        this.qtdePassageiros = 0;
        this.tipo = "";
    }

    @Override
    public int getRodas() {
        return 8;
    }

    @Override
    public int getJanelas() {
        return 16;
    }

    @Override
    public int getQtdeRadios() {
        return 1;
    }

    @Override
    public float getQtdeCombustivel() {
        return 50f;
    }

    @Override
    public float getVelocidade() {
        return 50f;
    }

    public Integer getQtdePassageiros() {
        return this.qtdePassageiros;
    }

    public void setQtdePassageiros(Integer qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Onibus { " +
                "nome = " + getNome() +
                ", qtdePassageiros = " + qtdePassageiros +
                ", tipo = '" + tipo + '\'' +
                '}';
    }

    @Override
    public float emitirPassagem() {
        return 5f;
    }

    @Override
    public float calcularPagamento(Integer distancia, float taxa) {
        return 50 * distancia + taxa;
    }

    @Override
    public float calcularTempoViagem(Integer x1, Integer x2, Integer y1, Integer y2) {
        return 50 * (float) (Math.sqrt((Math.pow((x1-x2), 2) + Math.pow((y1-y2),2))));
    }
}
