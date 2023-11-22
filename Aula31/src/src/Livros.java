package src;
public class Livros extends MaterialEscolar {
	private int ISBN = 0;
	private Etiqueta etiqueta;
	
	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}
	public Etiqueta getEtiquieta() {
		return this.etiqueta;
	}
	
}
