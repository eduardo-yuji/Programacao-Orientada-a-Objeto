package src;

public final class CaixaEletronico extends SistemaPagamento implements IPagamento{

	private int numeroTerminal;

	
	public int getNumeroTerminal() {
		return numeroTerminal;
	}

	public void setNumeroTerminal(int numeroTerminal) {
		this.numeroTerminal = numeroTerminal;
	}
	
	
	
}
