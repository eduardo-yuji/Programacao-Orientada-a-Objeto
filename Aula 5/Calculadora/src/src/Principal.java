package src;
public class Principal {

    public Principal(){
           Calculadora samsung = new Calculadora();
           //System.out.println( samsung.getCOR() );
           //System.out.println( samsung.NOME ); 
           //System.out.println( samsung.MODELO );

           //samsung.getTAMANHO();
          //System.out.println( samsung.getNOME() );

    }

    public Principal(String COR) {
    	Calculadora samsung = new Calculadora();
    	samsung.setCOR(COR);
    	System.out.println(samsung.toString());
    }
    
    //Construtor sobrecarregador COR, NOME 
    public Principal(String COR, String NOME) {
    	Calculadora samsung = new Calculadora();
    	samsung.setCOR(COR);
    	samsung.setNOME(NOME);
    	System.out.println(samsung.toString());
    }
    
    //Construtor sobrecarregador COR, NOME, TAMANHO
    public Principal(String COR, String NOME, String TAMANHO) {
    	Calculadora samsung = new Calculadora();
    	samsung.setCOR(COR);
    	samsung.setNOME(NOME);
    	samsung.setTAMANHO(TAMANHO);
    	System.out.println(samsung.toString());
    }
    
    //Construtor sobrecarregador COR, NOME, TAMANHO, MOLEDO
    public Principal(String COR, String NOME, String TAMANHO, String MODELO) {
    	Calculadora samsung = new Calculadora();
    	samsung.setCOR(COR);
    	samsung.setNOME(NOME);
    	samsung.setTAMANHO(TAMANHO);
    	samsung.setMODELO(MODELO);
    	System.out.println(samsung.toString());
    }
    
    public static void main( String [ ] args ){
           Principal p = new Principal();
           Principal p2 = new Principal("AZUL");
           Principal p3 = new Principal("AZUL", "SAMSUNG");
           Principal p4 = new Principal("AZUL", "SAMSUNG", "150");
           Principal p5 = new Principal("AZUL", "SAMSUNG", "150", "W2D2");
    } 

}
