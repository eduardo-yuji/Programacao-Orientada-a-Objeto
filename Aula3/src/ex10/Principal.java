package ex10;

public class Principal {
	
	public Principal() {
		
		Estudante joao = new Estudante("Joao",2412345);
		System.out.println(joao);
		
		Estudante maria = new Estudante("Maria");
		System.out.println(maria);
		
		Estudante carlos = new Estudante("Pato");
		System.out.println(carlos.toString(3));
	}
	
	
	
	public static void main(String [] args) {
		Principal principal = new Principal();
	}
}
