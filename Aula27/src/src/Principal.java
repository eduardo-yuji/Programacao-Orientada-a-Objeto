package src;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

//Jframe é um Container
public class Principal extends JFrame{
	
	private int WIDTH = 1280;
	private int HEIGHT = 720;
	
	private JLabel labelNome;
	private JLabel labelSobrenome;
	private JLabel labelEndereco;
	private JLabel labelCEP;
	
	public void gui() {
		setTitle("TÍTULO DA JANELA");
		
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		labelNome = new JLabel("Nome: Lmouse");
		labelSobrenome = new JLabel("Sobrenome: Petroli");
		labelEndereco = new JLabel("Endereço: Rua Denhei Kanashiro, 85");
		labelCEP = new JLabel("CEP: 86812600");
		
		add(labelNome);
		add(labelSobrenome);
		add(labelEndereco);
		add(labelCEP);
	}
	
	
	public Principal() {
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		gui();
	}
	
	public static void main(String [] a) {
		new Principal();
	}
}
