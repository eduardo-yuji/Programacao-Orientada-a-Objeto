package src;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculadora {

	public void somar() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o Valor1: ");
		String valor1 = entrada.next();
		int v1 = Integer.parseInt(valor1);
				
		System.out.println("Digite o Valor2: ");
		String valor2 = entrada.next();
		int v2 = Integer.parseInt(valor2);
		
		int soma = v1 + v2;
		System.out.print(soma);
	}
	
	public void somarGrafico() {
		JOptionPane entrada = new JOptionPane();
		String valor1 = entrada.showInputDialog(null, "Titulo", "Digite o Valor 1: ");
		String valor2 = entrada.showInputDialog(null, "Titulo", "Digite o Valor 2: ");
		
		int v1 = Integer.parseInt(valor1);
		int v2 = Integer.parseInt(valor2);
		int soma = v1+v2;
		
		entrada.showMessageDialog(null, "Resultado: " + soma, "Título", JOptionPane.INFORMATION_MESSAGE);
	}
	

	public void subtracaoGrafico() {
		JOptionPane entrada = new JOptionPane();
		String valor1 = entrada.showInputDialog(null, "Titulo", "Digite o Valor 1: ");
		String valor2 = entrada.showInputDialog(null, "Titulo", "Digite o Valor 2: ");
		
		int v1 = Integer.parseInt(valor1);
		int v2 = Integer.parseInt(valor2);
		int subtracao = v1-v2;
		
		entrada.showMessageDialog(null, "Resultado: " + subtracao, "Título", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void multGrafico() {
		JOptionPane entrada = new JOptionPane();
		String valor1 = entrada.showInputDialog(null, "Titulo", "Digite o Valor 1: ");
		String valor2 = entrada.showInputDialog(null, "Titulo", "Digite o Valor 2: ");
		
		int v1 = Integer.parseInt(valor1);
		int v2 = Integer.parseInt(valor2);
		int mult = v1*v2;
		
		entrada.showMessageDialog(null, "Resultado: " + mult, "Título", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void divGrafico() {
		JOptionPane entrada = new JOptionPane();
		String valor1 = entrada.showInputDialog(null, "Titulo", "Digite o Valor 1: ");
		String valor2 = entrada.showInputDialog(null, "Titulo", "Digite o Valor 2: ");
		
		int v1 = Integer.parseInt(valor1);
		int v2 = Integer.parseInt(valor2);
		int div = v1/v2;
		
		entrada.showMessageDialog(null, "Resultado: " + div, "Título", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void main(String [] args) {
		Calculadora samsung = new Calculadora();
		//samsung.somar();
		samsung.somarGrafico();
		samsung.subtracaoGrafico();
		samsung.multGrafico();
		samsung.divGrafico();
	}
	
}
