package src;

public class Equipamento {

    public String COR;
    private Float TAMANHO;
    public Equipamento(String COR, Float TAMANHO){
    	this.COR = COR;
    	this.TAMANHO = TAMANHO;
	}

   public Float getTamanho(){
         return this.TAMANHO;
   }

}
