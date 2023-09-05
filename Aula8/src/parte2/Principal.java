package parte2;

public class Principal {

	public Principal() {
		Transportadora transportadora = new Transportadora("Petras", 512);
		System.out.println("Nome da Empresa: " + transportadora.getNome());
		System.out.println("Quantidade de Vendas: " + transportadora.getVendas());
		
		Transportadora poo = new Transportadora("POO","105.123.231-x");
		System.out.println("Nome da Empresa: " + poo.getNome());
		System.out.println("CNPJ da Empresa: " + poo.getCNPJ());
	}
	
	public static void main(String [] args) {
		Principal principal = new Principal();
	}
}
