package src;

public class Principal {

	public Principal(){
		Calculadora samsung = new Calculadora();
		System.out.println("Soma (Samsung): " + samsung.somar(5,  10));
		System.out.println("Subtracao (Samsung):" + samsung.subtrair(10, 2));
		
		
		ICalculadora hp = new Hp();
		System.out.println("Soma (HP): " + hp.somar(-2, 10));
		System.out.println("Subtracao (HP):" + hp.subtrair(2, 21));
		
	}
	
	
	
	public static void main(String []args) {
		new Principal();
	}
	
}
