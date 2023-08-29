package lista;

public class Curso {
    private String nome;
    private Estudante [ ] lista;    //vetor, array

    // [   Estudante  |  Estudante   |   Estudante    | Estudante   ]  Vetor Estudante lista[0]

    public Curso() {
           lista = new Estudante[4];  //tamanho fixo!

           for( int i=0; i < lista.length; i++)
                  lista[i] = new Estudante("ALUNO" + i);
   }
    public String toString(){
           String result="";
           for( int i=0; i < lista.length; i++)
                 result = result + "\nALUNO"+i + " :" + lista[i].toString();
           return result;
    }
}
