package Exercicio3;

public interface IVeiculo {
    public float emitirPassagem();
    public float calcularPagamento(Integer distancia, float taxa);
    public float calcularTempoViagem(Integer x1, Integer x2, Integer y1, Integer y2);
}
