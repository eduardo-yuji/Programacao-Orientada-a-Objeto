package src;

import javax.swing.JOptionPane;

public class Principal {
	
	public Principal() {
		Calculadora samsung = new Calculadora();
		Calculadora hp = new Calculadora();
		
		JOptionPane entrada = new JOptionPane();
		
		String valor1 = entrada.showInputDialog(null,"Valor 1","Insert");
		int campo1 = Integer.parseInt(valor1);
		samsung.setCampo1(campo1);
		
		String valor2 = entrada.showInputDialog(null,"Valor 2","Insert");
		int campo2 = Integer.parseInt(valor2);
		samsung.setCampo2(campo2);
		
		entrada.showMessageDialog(null, "Soma: " + samsung.somar());
		
		//-----------------------------------------------------//
		
		
		valor1 = entrada.showInputDialog(null,"Valor 1","Insert");
		campo1 = Integer.parseInt(valor1);
		hp.setCampo1(campo1);
		
		valor2 = entrada.showInputDialog(null,"Valor 2","Insert");
		campo2 = Integer.parseInt(valor2);
		hp.setCampo2(campo2);
		
		entrada.showMessageDialog(null, "Soma: " + hp.somar());
		
		/*
		samsung.setCampo1(10);
		samsung.setCampo2(20);
		samsung.setMarca("SAMSUNG");
		samsung.setCor("BRANCA");
		samsung.setTamanho(10.5f);
		
		System.out.println("----------Calculadora Samsung----------");
		System.out.println("Soma: " + samsung.somar());
		System.out.println("Marca: "+ samsung.getMarca() + "\nCor: " + samsung.getCor() + "\nTamanho: " + samsung.getTamanho() + "\n"); 
		
		//-----------------------------------------------------//
		
		hp.setCampo1(25);
		hp.setCampo2(25);
		hp.setMarca("HP");
		hp.setCor("PRETO");
		hp.setTamanho(12.3f);
		
		System.out.println("----------Calculadora HP----------");
		System.out.println("Soma: " + hp.somar());	
		System.out.println("Marca: "+ hp.getMarca() + "\nCor: " + hp.getCor() + "\nTamanho: " + hp.getTamanho() + "\n"); 
		*/
	}
	
	public static void main(String [] args) {
		Principal principal = new Principal();
	}
	
}
