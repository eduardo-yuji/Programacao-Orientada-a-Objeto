package ex2;

/*
public class Calculadora {
	
	float resultado;
	
	public void executar() {
		Operacao op = new Operacao();
		System.out.println(op.somar(1,2));
	}
	
	public class Operacao{
		public float somar(float a, float b) {
			return a + b;
		}
	}
	
	public static void main(String [] args) {
		
		Calculadora samsung = new Calculadora();
		samsung.executar();
		
	}
	
}
*/

public class Calculadora {

float resultado = 222;



public static class Operacao{
	float resultado;
	public float somar(float a, float b) {
		resultado = a+b;
		return resultado;
	}
	public void executar() {
		System.out.println(somar(1,2));
	}
}

public static void main(String [] args) {
	Operacao samsung = new Operacao();
	samsung.executar();
	
}

}
