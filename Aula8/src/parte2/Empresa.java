package parte2;
public class Empresa {
	private String nome;
	private int vendas;
	private String cnpj;
	
	public Empresa(String nome, int vendas) {
		this.nome = nome;
		this.vendas = vendas;
	}
	
	public Empresa(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return this.nome;
	}
	public int getVendas() {
		return this.vendas;
	}
	public String getCNPJ() {
		return this.cnpj;
	}
	
}
