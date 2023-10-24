/*
Exercicio 8
Autor(es): João Vitor Levorato de Souza e Eduardo Yuji Yoshida Yamada
Data: 10/10/2023
*/

package Exercicio8;

public class Principal {
    public class ExceptionA extends Throwable{
        public ExceptionA(String message) {
            super(message);
        }
    }

    public class ExceptionB extends ExceptionA {

        public ExceptionB(String message) {
            super(message);
        }
    }

    public class ExceptionC extends ExceptionB {

        public ExceptionC(String message) {
            super(message);
        }
    }

    public Principal() {
        try {
            throw new ExceptionC("Exeção C");
        } catch (ExceptionA e) {
            System.out.println("Exeção A com mensagem: '" + e.getMessage() + "' da classe: " + e.getClass().getSimpleName());
        }

        try {
            throw new ExceptionB("Exeção B");
        } catch (ExceptionA e) {
            System.out.println("Exeção A com mensagem: '" + e.getMessage() + "' da classe: " + e.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        new Principal();
    }
}
