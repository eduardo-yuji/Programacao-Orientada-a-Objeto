package src;

public class HP {

    private String COR;
    private Float TAMANHO;

    //padrao
    public HP(){
         this.COR = "BRANCA";
         this.TAMANHO = 932.4f;
    }

    public HP(String COR){
          this.COR = "CINZA";
          this.TAMANHO = 512.1f;  //padrao
   }

   public HP(String COR, Float TAMANHO){
          this.COR = COR;
          this.TAMANHO = TAMANHO;
   }

   public String toString(){
                 return  "COR: "  + this.COR + 
                              "\nTAMANHO: " + this.TAMANHO + "\n";
    }

}
