package src;

//calculadora é subclasse da superclasse Equipamentos
public class Calculadora extends Equipamento{

	protected Float resultadoSoma = 1.2f;
	protected Float resultadoSubtracao = 0.5f;
	
	
	public Float getResultadoSoma() {
		return 123.4f;
	}
	
	public Float getResultadoSubtracao() {
		return 12.5f;
	}
	
	
	
	public Calculadora() {
		System.out.println(getNome());
		System.out.println(getCor());
		System.out.println(getTamanho());
	}
	
	/*
	public Calculadora() {
		//Chamada explicita ao construtor dar superclasse
		super("SAMSUNG","BRANCO",15.12f);
		System.out.println(getNome());
		System.out.println(getCor());
		System.out.println(getTamanho());	
	}
	*/
	
	public static void main(String [] args) {
		new Calculadora();
	}
	
}
