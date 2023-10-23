package Exercicio1;

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
}
