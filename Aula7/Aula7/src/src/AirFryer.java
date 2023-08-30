package src;

public class AirFryer extends Microondas{
	
	public Boolean sensorPorta;
	public AirFryer() {
		super("BRASTEMP");
		this.sensorPorta = true;
		System.out.println(getNome());
		System.out.println(tempoCozimento);
	}
	
	public static void main(String [] a) {
		new AirFryer();
	}
	
}
