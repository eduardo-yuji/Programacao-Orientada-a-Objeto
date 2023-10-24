package src;

public abstract class SistemaPagamento {

	private Conta conta;

	public abstract Conta getConta();
	public abstract void setConta(Conta conta);
	
	public SistemaPagamento() {
		conta = new Conta();
	}
	public SistemasPagamento(Conta conta) {
		conta = new Conta();
	}
	
	public Conta getConta() {
		return this.conta;
	}
	
}
