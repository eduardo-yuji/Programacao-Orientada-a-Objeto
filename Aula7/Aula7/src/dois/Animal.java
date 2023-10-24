package dois;

public class Animal {
	private String nome;
	private String cor;
	private float tamanho;
	
	public Animal(String nome, String cor, float tamanho) {
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
