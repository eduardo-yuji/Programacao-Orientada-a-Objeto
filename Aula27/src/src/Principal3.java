package src;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

//Jframe é um Container
public class Principal3 extends JFrame{
	
	private int WIDTH = 1000;
	private int HEIGHT = 480;
	
	private JLabel labelNome;
	private JLabel labelSobrenome;
	private JLabel labelEndereco;
	private JLabel labelCEP;
	
	public void gui() {
		setTitle("TÍTULO DA JANELA");
		
		GridLayout layout = new GridLayout(2,2);
		setLayout(layout);
		
		labelNome = new JLabel("Nome: Lmouse");
		labelNome.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Inside");
			}
		});
		labelSobrenome = new JLabel("Sobrenome: Petroli");
		labelEndereco = new JLabel("Endereço: Rua Denhei Kanashiro, 85");
		labelCEP = new JLabel("CEP: 86812600");
		
		add(labelNome);
		add(labelSobrenome);
		add(labelEndereco);
		add(labelCEP);
	}
	
	
	public Principal3() {
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		gui();
	}
	
	public static void main(String [] a) {
		new Principal3();
	}
}
