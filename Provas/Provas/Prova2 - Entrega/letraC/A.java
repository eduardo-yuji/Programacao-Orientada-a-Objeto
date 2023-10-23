/*
Autor:  Sefora Davanso de Assis
RA: 2367777
*/
package letraC;


public abstract class A extends B {
    public abstract int a1( );
    public abstract int a2( );  
    
    public A() {
    	B b = new B() {
    		public int b1() {return 1;}
    		public int b3() {return 1;}
    		public int b2() {return 1;}
		};
    }
}
