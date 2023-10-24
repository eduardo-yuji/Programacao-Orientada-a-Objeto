package src;
public class Calculadora {
	int campo1;	//Atributos
	int campo2; //Variaveis de Instancia
	int operacao; 
	String marca;
	String cor;
	Float tamanho;
	
	//Método mutador
	public void setCampo1(int campo1) {
		this.campo1 = campo1;
	}
	
	public void setCampo2(int campo2) {
		this.campo2 = campo2;
	}
	
	public int somar() {
		return this.campo1 + this.campo2;
	}

	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setTamanho(Float tamanho) {
		this.tamanho = tamanho;
	}
	
	//Método acessor
	
	String getMarca() {
		return this.marca;
	}
	
	String getCor() {
		return this.cor;
	}
	
	Float getTamanho() {
		return this.tamanho;
	}
	
	
}