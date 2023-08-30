package dois;

public class Sapo extends Animal{

	public Sapo() {
		super("Rato", "Cinza", 25f);
		System.out.println(getNome());
		System.out.println(getCor());
		System.out.println(getTamanho());
	}

	public static void main(String [] args) {
		new Sapo();
	}
		
}
