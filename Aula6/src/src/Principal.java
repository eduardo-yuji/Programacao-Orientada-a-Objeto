package src;
public class Principal {

           public Principal() {
                Calculadora  solar = new Calculadora();

                int cor = solar.getCOR();
                int tamanho = solar.TAMANHO;
                int valor = solar.VALOR;
                
                int tipo = Calculadora.TIPO; //TIPO: variavel de classe
           }

           public static void main( String [ ] args ){
                   Principal principal = new Principal();
           }
}
