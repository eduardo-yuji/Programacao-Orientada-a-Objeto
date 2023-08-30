package src;

public class Equipamento {
	private String nome;
	private String cor;
	private float tamanho;
	
	
	public Equipamento() {
		this.nome = "HP";
		this.cor = "VERMELHA";
		this.tamanho = 444.4f;
	}
	
	
	public Equipamento(String nome) {
		this.nome = nome;
	}
	
	
	public Equipamento(String nome, String cor, float tamanho) {
		this.nome = nome;
		this.cor = cor;
		this.tamanho = tamanho;
	}
	
	
	
	
	public String getNome() {
		return this.nome;
	}
	public String getCor() {
		return this.cor;
	}
	public float getTamanho() {
		return this.tamanho;
	}
	
}

