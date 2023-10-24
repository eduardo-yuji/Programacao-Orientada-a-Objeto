package Exercicio3;

public class EmpresaViagem {
    private String nome;
    private String propprietario;
    private String endereco;
    private Float vendasMensais;
    private Integer qtdeMaxPassagens;
    private Integer qtdeFuncionarios;
    private Onibus onibus;
    private Barco barco;

    public EmpresaViagem(String nome, String propprietario, String endereco, Float vendasMensais, Integer qtdeMaxPassagens, Integer qtdeFuncionarios, Onibus onibus) {
        this.nome = nome;
        this.propprietario = propprietario;
        this.endereco = endereco;
        this.vendasMensais = vendasMensais;
        this.qtdeMaxPassagens = qtdeMaxPassagens;
        this.qtdeFuncionarios = qtdeFuncionarios;
        this.onibus = onibus;
    }

    public EmpresaViagem() {
        this.nome = "";
        this.propprietario = "";
        this.endereco = "";
        this.vendasMensais = 0.00f;
        this.qtdeMaxPassagens = 0;
        this.qtdeFuncionarios = 0;
        this.onibus = new Onibus();
    }

    @Override
    public String toString() {
        return "EmpresaViagem { " +
                "nome = '" + nome + '\'' +
                ", propprietario = '" + propprietario + '\'' +
                ", endereco = '" + endereco + '\'' +
                ", vendasMensais=" + vendasMensais +
                ", qtdeMaxPassagens = " + qtdeMaxPassagens +
                ", qtdeFuncionarios = " + qtdeFuncionarios +
                ", onibus = " + onibus +
                ", barco = " + barco +
                '}';
    }
}
