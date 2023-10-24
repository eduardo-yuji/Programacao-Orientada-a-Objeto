package paracasa;

public class Equipamento {
    private String nome;
    private String COR;

    public Equipamento(String nome){
           this.nome = nome;
    }

    public Equipamento(String nome, String cor){
        this.nome = nome;
        this.COR = cor;
 }

    
    public String toString(){
          return "O nome do Equipamento eh: " + this.nome;
   }
   public String getNome(){
           return this.nome;
   }
   
   public String getCor() {
	   return this.COR;
   }
}
