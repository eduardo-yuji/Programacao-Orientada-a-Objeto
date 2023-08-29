package src;

public class Principal2 {

    public Principal2(){
            HP   hp1  = new HP();  
            System.out.println( hp1 );

            HP  hp2  = new HP("AZUL");
            System.out.println(  hp2 );

            HP hp3 = new HP("AZUL", 123.4f );
            System.out.println(  hp3 );
     }

    public static void main(String [] a ){
             new Principal2();
    }
}
