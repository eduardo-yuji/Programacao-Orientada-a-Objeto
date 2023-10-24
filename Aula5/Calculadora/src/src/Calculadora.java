package src;

public class Calculadora {
    private String COR;  //Atributos
    private String TAMANHO;  //Atributos

    public String NOME;
    String MODELO;   //package-private

    //Metodos assessores
    public String getCOR(){   return this.COR;  }

    //Metodos mutadores
    public void setCOR(String COR) { this.COR = COR; }
    
    public void setNOME(String NOME) { this.NOME = NOME; }
    
    public void setTAMANHO(String TAMANHO) { this.TAMANHO = TAMANHO; }
    
    public void setMODELO(String MODELO) { this.MODELO = MODELO; }
    
    private String getTAMANHO(){  return this.TAMANHO; }
    String getNOME(){  return this.NOME; }  //package-private

	public String toString() {
		return "---Calculadora---\nCOR: "+this.COR+"; TAMANHO: "+this.TAMANHO+"; NOME: "+this.NOME + "; MODELO: "+this.MODELO;
	}
    
    
}
