/*
 * Autor: Eduardo Yuji Yoshida Yamada
 * Ra: 2320606
 * */

package Q1B;

import java.util.ArrayList;
import java.util.Scanner;

import Q2A.Principal.Roupa;

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
		private ArrayList <Funcionario> funcionarios = new ArrayList<>();
		
		public Departamento(int departamento) {
			//funcionario.add("Joao");
			Funcionario funcionario1 = new Funcionario("Joao");
			Funcionario funcionario2 = new Funcionario("Maria");
			Funcionario funcionario3 = new Funcionario("Jorge");
			System.out.println(funcionario1);
			
		}
		
	}
	
	
	public class DepartamentosDaEmpresa {
		private ArrayList <Departamento> departamento = new ArrayList<>();
		
		public DepartamentosDaEmpresa() {
			Departamento departamento1 = new Departamento(1);
			Departamento departamento2 = new Departamento(2);
			Departamento departamento3 = new Departamento(3);
		}
		
	}
	
	
	public void leitura() {
        Scanner entrada = new Scanner(System.in);
                System.out.print("Digite o numero do departamento do primeiro funcionario: ");
		int d1 = entrada.nextInt();
                System.out.print("Digite o numero do departamento do segundo funcionario: ");
		int d2 = entrada.nextInt();
                

    }
	
	public class Excecao extends ArithmeticException{
		
	
		public int corrigir(){
			int d1 = 0;
	    	return d1;
	    }
		
		public int corrigir1(){
			int d2 = 0;
	    	return d2;
	    }
		
		public int corrigir2(){
			int d3 = 0;
	    	return d3;
	    }
		
	}
	
	public void iniciar() {
		try {
			leitura();
				
		}catch(Excecao e){
			System.out.println("Erro, numero nao inteiro");
			e.corrigir();
			e.corrigir1();
			e.corrigir2();
			leitura();
		}
	}
	
	
	public static void main(String[] args) {
		Principal principal= new Principal();
		principal.iniciar();
	}

}




