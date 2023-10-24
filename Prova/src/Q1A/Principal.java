/*
 * Autor: Eduardo Yuji Yoshida Yamada
 * Ra: 2320606
 * */

package Q1A;

import java.util.Scanner;

import Q1B.Principal.Departamento;

public class Principal {
	
	public class Funcionario {
		private String nome;

		public Funcionario(String nome) {
			super();
			this.nome = nome;
		}

		public String toString() {
			return super.toString();
		}

		public String getNome() {
			return nome;
		}

		/*
		public void setNome(String nome) {
			this.nome = nome;
		}*/

		
	}
	
	public class Departamento {
		private String nome;
		private Integer numero;
		
		public Departamento(int departamento) {
			Funcionario funcionario1 = new Funcionario("Joao");
			Funcionario funcionario2 = new Funcionario("Maria");
			Funcionario funcionario3 = new Funcionario("Jorge");
			System.out.println(funcionario1);
			this.numero = departamento;
			
		}
		
	}
	
	
	public class DepartamentosDaEmpresa {
		private Departamento departamento;
		
		public DepartamentosDaEmpresa() {
			Departamento departamento1 = new Departamento(1);
			Departamento departamento2 = new Departamento(2);
			Departamento departamento3 = new Departamento(3);
		}
		
	}
	
	
	public static void main(String[] args) {
		Principal principal= new Principal();
		
	}

}




