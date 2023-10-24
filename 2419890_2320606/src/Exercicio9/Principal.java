/*
Exercicio 9
Autor(es): João Vitor Levorato de Souza e Eduardo Yuji Yoshida Yamada
Data: 10/10/2023
*/

package Exercicio9;

import java.io.IOException;

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

    public Principal() {
        try {
            throw new ExceptionA("Exceão A");
        } catch (ExceptionA e) {
            System.out.println("Tipo de exceção: " + e.getMessage());
        }

        try {
            throw new ExceptionB("Exceão B");
        } catch (ExceptionB e) {
            System.out.println("Tipo de exceção: " + e.getMessage());
        }

        try {
            throw new NullPointerException("Exceão Null Pointer");
        } catch (NullPointerException e) {
            System.out.println("Tipo de exceção: " + e.getMessage());
        }

        try {
            throw new IOException("Exceão Input Output");
        } catch (IOException e) {
            System.out.println("Tipo de exceção: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Principal();
    }
}
