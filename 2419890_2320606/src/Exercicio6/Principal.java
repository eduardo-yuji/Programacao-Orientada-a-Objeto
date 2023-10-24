/*
Exercicio 6
Autor(es): João Vitor Levorato de Souza e Eduardo Yuji Yoshida Yamada
Data: 10/10/2023
*/

package Exercicio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {

    public abstract class Assalariado extends Empregado {
        private float salarioSemanal;

        public Assalariado(String nome, String sobrenome, float salarioBase, float salarioSemanal) {
            super(nome, sobrenome, salarioBase);
            this.salarioSemanal = salarioSemanal;
        }
    }

    public class Bonificado extends Assalariado{
        private float bonificacao;

        public Bonificado(String nome, String sobrenome, float salarioBase, float bonificacao, Float salarioSemanal) {
            super(nome, sobrenome, salarioBase, salarioSemanal);
            this.bonificacao = bonificacao;
        }


        @Override
        public float ganhos() {
            return this.getSalarioBase() + this.bonificacao;
        }

        @Override
        public void imprimir() {
            System.out.println("Bonificado { "+
                    "Nome = " + this.getNome() + " " + this.getSobrenome() +
                    ", salario base = " + this.getSalarioBase() +
                    ", bonificacao = " + this.bonificacao +
                    " }\n"
            );
        }
    }

    public class Comissionado extends Empregado {
        private float taxaComissao;

        public Comissionado(String nome, String sobrenome, float salarioBase, float taxaComissao) {
            super(nome, sobrenome, salarioBase);
            this.taxaComissao = taxaComissao;
        }


        @Override
        public float ganhos() {
            return this.getSalarioBase() + this.taxaComissao;
        }

        @Override
        public void imprimir() {
            System.out.println("Comissionado { "+
                    "Nome = " + this.getNome() + " " + this.getSobrenome() +
                    ", salario base = " + this.getSalarioBase() +
                    ", taxa de comissao = " + this.taxaComissao +
                    " }\n"
            );
        }
    }

    public abstract class Empregado {
        private String nome;
        private String sobrenome;
        private float salarioBase;

        public Empregado(String nome, String sobrenome, float salarioBase) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.salarioBase = salarioBase;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSobrenome() {
            return sobrenome;
        }

        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }

        public float getSalarioBase() {
            return salarioBase;
        }

        public void setSalarioBase(float salarioBase) {
            this.salarioBase = salarioBase;
        }

        public abstract float ganhos();

        public abstract void imprimir();
    }

    public class Horista extends Empregado {
        private int horas;

        public Horista(String nome, String sobrenome, float salarioBase, int horas) {
            super(nome, sobrenome, salarioBase);
            this.horas = horas;
        }

        @Override
        public float ganhos() {
            return this.getSalarioBase() * this.horas;
        }

        @Override
        public void imprimir() {
            System.out.println("Horista { "+
                    "Nome = " + this.getNome() + " " + this.getSobrenome() +
                    ", salario base = " + this.getSalarioBase() +
                    ", horas = " + this.horas +
                    " }\n"
            );
        }
    }

    public Principal() {
        LinkedList<Empregado> empregados = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o salario base: ");
        Float salarioBase = input.nextFloat();
        System.out.println("Digite a bonificacao: ");
        Float bonificacao = input.nextFloat();
        System.out.println("Digite o salario semanal: ");
        Float salarioSemanal = input.nextFloat();
        System.out.println("Digite a taxa de comissao: ");
        Float taxaComissao = input.nextFloat();
        System.out.println("Digite a quantidade de horas: ");
        int horas = input.nextInt();
        Bonificado b1 = new Bonificado("Joao","Silva", salarioBase, bonificacao, salarioSemanal);
        Comissionado c1 = new Comissionado("Maria","Soares", salarioBase, taxaComissao);
        Horista h1 = new Horista("Jomar","Silva Soares", salarioBase, horas);
        empregados.add(b1);
        empregados.add(c1);
        empregados.add(h1);

        for ( Empregado empregado : empregados ) {
            empregado.imprimir();
            System.out.println(empregado.ganhos());
        }
        input.close();
    }
    public static void main(String[] args) {
        new Principal();
    }
}
