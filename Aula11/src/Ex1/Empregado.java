package Ex1;

public class Empregado{
	
	private float salario;
	
	public Empregado(float salario) {
		this.salario = salario;
	}
	
	private  Data dataNascimento;

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	
	
	
	
	
	
	public String toString() {
		return "Empregado " + this.getClass().getName() + " Salario: [" + salario +"]";
	}
	
}
