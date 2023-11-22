package src;

import javax.swing.JFrame;

public class Principal extends JFrame{

	private Livros livro;
	
	public Principal() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		
		livro.setISBN(1234);
		livro.getEtiquieta().setQRCODE(1234);
	}
}
