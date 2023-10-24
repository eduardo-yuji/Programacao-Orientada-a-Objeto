package paracasa;

public class Calculadora extends Equipamento {
	private String MARCA;
 
     public Calculadora(String nome, String COR){
                 super(nome, COR);
    }

    
    public String toString(){
         return getNome() + " COR: " + getCor() + " MARCA: "+ this.MARCA;

    }

}
