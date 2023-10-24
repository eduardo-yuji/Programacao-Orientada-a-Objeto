package src;  //Pacote: diretorio
public class Calculadora {
     public static int TIPO = 10;

      private int COR;    //Precisa ter um metodo acessor
      private int MEMORIA;  //Outras classes nao tem acesso.
      public int TAMANHO;   //Todas as outras classes tem acesso
      int VALOR;  //package-private: privada de pacote

      public int getCOR() {  return  this.COR; }

      public int getCOR(int cor){
           return this.COR;
      }
}
