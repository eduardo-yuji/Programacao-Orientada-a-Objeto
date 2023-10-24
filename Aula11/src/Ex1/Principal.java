package Ex1;

import java.util.ArrayList;

public class Principal {
	
	public Principal() {
		ArrayList<Empregado> listaPagamento = new ArrayList<>();
		Empregado maria = new Chefe(1000.0f);
		Empregado joao = new Balconista(500.0f);
		Empregado antonio = new Estagiario(250.0f);
		
		listaPagamento.add(maria);
		listaPagamento.add(joao);
		listaPagamento.add(antonio);
		
		for(Empregado empregado :listaPagamento) {
			System.out.println(empregado);
		}
	}
	
	public static void main(String [] args) {
		new Principal();
	}
}
