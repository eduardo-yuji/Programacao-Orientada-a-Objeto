package lista;

public class Principal {
    
    public Principal(){
    	Estudante estudante[] = new Estudante[3];
    	
    	estudante[0] = new Estudante("Levoras");
    	estudante[1] = new Estudante("Petrolis", 95);
    	estudante[2] = new Estudante("Yoshas", 102, "021.612.512-41");
    
    	System.out.println(estudante[0].toString("a"));
    	System.out.println(estudante[1].toString("a",1));
    	System.out.println(estudante[2].toString("a",1,"b"));

    
    	
    }

    public static void main(String [ ] args ){
          new Principal();
    }

}
