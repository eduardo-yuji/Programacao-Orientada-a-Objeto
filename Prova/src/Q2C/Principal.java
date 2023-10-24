package Q2A;

import java.util.ArrayList;

public class Principal {

	public abstract class Roupa{
		public abstract String nome;
		public abstract String tamanho;
		public abstract double preco;
	}
	
	public class subRoupa extends Roupa{
		
		public String nome;
		public String tamanho;
		public double preco;
		
		public subRoupa(String nome, String tamanho, double preco) {
			this.nome = nome;
			this.tamanho = tamanho;
			this.preco = preco;
	    }
		public String nome() {
			return nome;
		}
		public String tamanho() {
			return tamanho;
		}
		public double preco() {
			return preco;
		}
	}
	
public class subRoupa2 extends Roupa{
		
		public String nome;
		public String tamanho;
		public double preco;
		
		public subRoupa2(String nome, String tamanho, double preco) {
			this.nome = nome;
			this.tamanho = tamanho;
			this.preco = preco;
	    }
		public String nome() {
			return nome;
		}
		public String tamanho() {
			return tamanho;
		}
		public double preco() {
			return preco;
		}
	}
	
	
	public class Cliente extends Roupa{
		
		public String nome;
		public String tamanho;
		
		ArrayList <Roupa> listadeRoupa = new ArrayList<>();
		
		Roupa a = new subRoupa("vestido","M",150);
		Roupa b = new subRoupa("camiseta","P",90);
		Roupa c = new subRoupa("camisa","G",90);
		Roupa d = new subRoupa("meia","M",20);		
		listadeRoupa.add(a);
		a = new subRoupa2("camisa","P",120);
		listadeRoupa.add(a);
		
		for(Roupa a : listadeRoupa) {
			System.out.println(a);
		}
		/*
		listadeRoupa.add(a);
		listadeRoupa.add(b);
		listadeRoupa.add(c);
		listadeRoupa.add(d);*/
		
	}
	

	public void principal() {
		
		
	}
	
	public static void main(String[] args) {
		Principal principal= new Principal();
	
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
