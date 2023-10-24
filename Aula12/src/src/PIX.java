package src;

public final class PIX extends SistemaPagamento implements IPagamento{

	private String chavePix;

	public String getChavePIX() { return chavePix; }
	public void setChavePIX(String chavePIX) { this.chavePix = chavePIX; }
	
	public  Conta getConta() { return getConta; }
	public  void (Conta conta) { this.conta = conta; }
	
	
	public Conta setConta(Conta conta) {
		super(conta);
	}
	
}
