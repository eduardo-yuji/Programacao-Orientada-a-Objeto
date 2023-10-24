/*
Exercicio 7
Autor(es): João Vitor Levorato de Souza e Eduardo Yuji Yoshida Yamada
Data: 10/10/2023
*/

package Exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public interface IOperacao {
        void setOperando1(float operando1); //Define o valor do primeiro operando
        void setOperando2(float operando2); //Define o valor do segundo operando
        float getResultado(); //Retorna o resultado da operação
        String getNome(); //Retorna o nome da operação
        int getQuantidade(); //Retorna a quantidade de instâncias da classe
    }

    public class Divisao implements IOperacao {
        private float operando1;
        private float operando2;
        private static int qtdeInstancias;

        public Divisao() {
            qtdeInstancias++;
        }

        @Override
        public void setOperando1(float operando1) {
            this.operando1 = operando1;
        }

        @Override
        public void setOperando2(float operando2) {
            this.operando2 = operando2;
        }

        @Override
        public float getResultado() {
            return this.operando1 / this.operando2;
        }

        @Override
        public String getNome() {
            return this.getClass().getSimpleName();
        }

        @Override
        public int getQuantidade() {
            return qtdeInstancias;
        }
    }

    public class Multiplicacao implements IOperacao{
        private float operando1;
        private float operando2;
        private static int qtdeInstancias;

        public Multiplicacao() {
            qtdeInstancias++;
        }

        @Override
        public void setOperando1(float operando1) {
            this.operando1 = operando1;
        }

        @Override
        public void setOperando2(float operando2) {
            this.operando2 = operando2;
        }

        @Override
        public float getResultado() {
            return this.operando1 * this.operando2;
        }

        @Override
        public String getNome() {
            return this.getClass().getSimpleName();
        }

        @Override
        public int getQuantidade() {
            return qtdeInstancias;
        }
    }

    public class Soma implements IOperacao {
        private float operando1;
        private float operando2;
        private static int qtdeInstancias;

        public Soma() {
            qtdeInstancias++;
        }

        @Override
        public void setOperando1(float operando1) {
            this.operando1 = operando1;
        }

        @Override
        public void setOperando2(float operando2) {
            this.operando2 = operando2;
        }

        @Override
        public float getResultado() {
            return this.operando1 + this.operando2;
        }

        @Override
        public String getNome() {
            return this.getClass().getSimpleName();
        }

        @Override
        public int getQuantidade() {
            return qtdeInstancias;
        }
    }

    public class Subtracao implements IOperacao {
        private float operando1;
        private float operando2;
        private static int qtdeInstancias = 0;

        public Subtracao() {
            qtdeInstancias++;
        }

        @Override
        public void setOperando1(float operando1) {
            this.operando1 = operando1;
        }

        @Override
        public void setOperando2(float operando2) {
            this.operando2 = operando2;
        }

        @Override
        public float getResultado() {
            return this.operando1 - this.operando2;
        }

        @Override
        public String getNome() {
            return this.getClass().getSimpleName();
        }

        @Override
        public int getQuantidade() {
            return qtdeInstancias;
        }
    }

    public Principal() {
        ArrayList<IOperacao> operacoes = new ArrayList<>();
        int opcao = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\n1 - Soma\n2 - Subtracao\n3 - Divisao\n4 - Multiplicacao\n5 - Mostrar resultados\n6 - Sair");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    Soma soma = new Soma();
                    System.out.println("Digite primeiro numero: ");
                    soma.setOperando1(input.nextFloat());
                    System.out.println("Digite segundo numero: ");
                    soma.setOperando2(input.nextFloat());
                    operacoes.add(soma);
                    break;
                case 2:
                    Subtracao subtracao = new Subtracao();
                    System.out.println("Digite primeiro numero: ");
                    subtracao.setOperando1(input.nextFloat());
                    System.out.println("Digite segundo numero: ");
                    subtracao.setOperando2(input.nextFloat());
                    operacoes.add(subtracao);
                    break;
                case 3:
                    Divisao divisao = new Divisao();
                    System.out.println("Digite primeiro numero: ");
                    divisao.setOperando1(input.nextFloat());
                    System.out.println("Digite segundo numero: ");
                    divisao.setOperando2(input.nextFloat());
                    operacoes.add(divisao);
                    break;
                case 4:
                    Multiplicacao multiplicacao = new Multiplicacao();
                    System.out.println("Digite primeiro numero: ");
                    multiplicacao.setOperando1(input.nextFloat());
                    System.out.println("Digite segundo numero: ");
                    multiplicacao.setOperando2(input.nextFloat());
                    operacoes.add(multiplicacao);
                    break;
                case 5:
                    for (IOperacao operacao: operacoes) {
                        System.out.println("\nOperacao de " + operacao.getNome() +
                                ": resultado = " + operacao.getResultado() +
                                "\nQuantidade de instancias do objeto: " + operacao.getQuantidade()
                        );
                    }
                    break;
                case 6:
                    System.out.println("Saindo...\n");
                    input.close();
                    return;
                default:
                    System.out.println("Opcao invalida\n");
                    break;
            }
        }

    }

    public static void main(String[] args) {
        new Principal();
    }
}
