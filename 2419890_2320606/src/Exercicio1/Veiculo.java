package Exercicio1;

import Exercicio10.Principal;

public class Veiculo implements IVeiculo {
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

    public void emitirPassagem() {

    }

    public void calcularPagamento() {

    }

    public void calcularTempoViagem() {

    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "nome = '" + nome + '\'' +
                '}';
    }
}
