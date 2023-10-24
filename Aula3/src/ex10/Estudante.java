package ex10;

public class Estudante {
	private String nome;
	private int ra;
	
	public Estudante(String nome, int ra) {
		this.nome = nome;
		this.ra = ra;
	}
	
	public Estudante(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Nome: "+ this.nome+"\nRa: "+this.ra+"\n";
	}
	
	public String toString(int x) {
		
		if(this.nome.length() < x) {
			return "Nome: "+ this.nome+"\n";
		}
			return "Error, verificar o tamanho\n";
	}
	
	
}
