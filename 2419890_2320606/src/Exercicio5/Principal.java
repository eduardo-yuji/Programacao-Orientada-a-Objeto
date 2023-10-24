/*
Exercicio 5
Autor(es): João Vitor Levorato de Souza e Eduardo Yuji Yoshida Yamada
Data: 10/10/2023
*/

package Exercicio5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
    public interface IVeiculo {
        public float emitirPassagem();
        public float calcularPagamento(Integer distancia, float taxa);
        public float calcularTempoViagem(Integer x1, Integer x2, Integer y1, Integer y2);
    }

    public interface IMoeda {
        public abstract float converterEmDolar();
    }

    public abstract class Veiculo implements IVeiculo {
        private String nome;

        public Veiculo(String nome) {
            this.nome = nome;
        }

        public Veiculo() {
            this.nome = "";
        }

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public abstract int getRodas();
        public abstract int getJanelas();
        public abstract int getQtdeRadios();
        public abstract float getQtdeCombustivel();
        public abstract float getVelocidade();

        @Override
        public String toString() {
            return "Veiculo{" +
                    "nome = '" + nome + '\'' +
                    '}';
        }
    }

    public class Barco extends Veiculo {
        private Integer qtdeCadeiras;
        private Integer qtdeMesas;

        public Barco(Integer qtdeCadeiras, Integer qtdeMesas, String nome) {
            super(nome);
            this.qtdeCadeiras = qtdeCadeiras;
            this.qtdeMesas = qtdeMesas;
        }

        public Barco() {
            this.qtdeCadeiras = 0;
            this.qtdeMesas = 0;
        }

        @Override
        public int getRodas() {
            return 0;
        }

        @Override
        public int getJanelas() {
            return 8;
        }

        @Override
        public int getQtdeRadios() {
            return 2;
        }

        @Override
        public float getQtdeCombustivel() {
            return 100f;
        }

        @Override
        public float getVelocidade() {
            return 90f;
        }

        public Integer getQtdeCadeiras() {
            return this.qtdeCadeiras;
        }

        public void setQtdeCadeiras(Integer qtdeCadeiras) {
            this.qtdeCadeiras = qtdeCadeiras;
        }

        public Integer getQtdeMesas() {
            return this.qtdeMesas;
        }

        public void setQtdeMesas(Integer qtdeMesas) {
            this.qtdeMesas = qtdeMesas;
        }

        @Override
        public String toString() {
            return "Barco { " +
                    "nome = " + getNome() +
                    ", qtdeCadeiras = " + qtdeCadeiras +
                    ", qtdeMesas = " + qtdeMesas +
                    '}';
        }

        public float emitirPassagem() {
            return 2000f;
        }

        public float calcularPagamento(Integer distancia, float taxa) {
            return 200 * distancia + taxa;
        }

        public float calcularTempoViagem(Integer x1, Integer x2, Integer y1, Integer y2) {
            return 20 * (float) (Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2),2)));
        }
    }

    public class Onibus extends Veiculo {
        private Integer qtdePassageiros;
        private String tipo;

        public Onibus(int qtdePassageiros, String tipo, String nome) {
            super(nome);
            this.qtdePassageiros = qtdePassageiros;
            this.tipo = tipo;
        }

        public Onibus() {
            this.qtdePassageiros = 0;
            this.tipo = "";
        }

        @Override
        public int getRodas() {
            return 8;
        }

        @Override
        public int getJanelas() {
            return 16;
        }

        @Override
        public int getQtdeRadios() {
            return 1;
        }

        @Override
        public float getQtdeCombustivel() {
            return 50f;
        }

        @Override
        public float getVelocidade() {
            return 50f;
        }

        public Integer getQtdePassageiros() {
            return this.qtdePassageiros;
        }

        public void setQtdePassageiros(Integer qtdePassageiros) {
            this.qtdePassageiros = qtdePassageiros;
        }

        public String getTipo() {
            return this.tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        @Override
        public String toString() {
            return "Onibus { " +
                    "nome = " + getNome() +
                    ", qtdePassageiros = " + qtdePassageiros +
                    ", tipo = '" + tipo + '\'' +
                    '}';
        }

        @Override
        public float emitirPassagem() {
            return 5f;
        }

        @Override
        public float calcularPagamento(Integer distancia, float taxa) {
            return 50 * distancia + taxa;
        }

        @Override
        public float calcularTempoViagem(Integer x1, Integer x2, Integer y1, Integer y2) {
            return 50 * (float) (Math.sqrt((Math.pow((x1-x2), 2) + Math.pow((y1-y2),2))));
        }
    }

    public class EmpresaViagem {
        private String nome;
        private String propprietario;
        private String endereco;
        private Float vendasMensais;
        private Integer qtdeMaxPassagens;
        private Integer qtdeFuncionarios;
        private Onibus onibus;
        private Barco barco;

        public EmpresaViagem(String nome, String propprietario, String endereco, Float vendasMensais, Integer qtdeMaxPassagens, Integer qtdeFuncionarios, Onibus onibus) {
            this.nome = nome;
            this.propprietario = propprietario;
            this.endereco = endereco;
            this.vendasMensais = vendasMensais;
            this.qtdeMaxPassagens = qtdeMaxPassagens;
            this.qtdeFuncionarios = qtdeFuncionarios;
            this.onibus = onibus;
        }

        public EmpresaViagem() {
            this.nome = "";
            this.propprietario = "";
            this.endereco = "";
            this.vendasMensais = 0.00f;
            this.qtdeMaxPassagens = 0;
            this.qtdeFuncionarios = 0;
            this.onibus = new Onibus();
        }

        @Override
        public String toString() {
            return "EmpresaViagem { " +
                    "nome = '" + nome + '\'' +
                    ", propprietario = '" + propprietario + '\'' +
                    ", endereco = '" + endereco + '\'' +
                    ", vendasMensais=" + vendasMensais +
                    ", qtdeMaxPassagens = " + qtdeMaxPassagens +
                    ", qtdeFuncionarios = " + qtdeFuncionarios +
                    ", onibus = " + onibus +
                    ", barco = " + barco +
                    '}';
        }
    }

    public class BitCoin implements IMoeda {
        public float converterEmDolar() {
            return 27000f;
        }
    }

    public class Euro implements IMoeda {
        public float converterEmDolar() {
            return 1.05f;
        }
    }

    public class Real implements IMoeda {
        public float converterEmDolar() {
            return 0.20f;
        }
    }

    public void calcular(Scanner input, Veiculo veiculo) {
        System.out.println(veiculo);
        System.out.println("Passagem: "+ veiculo.emitirPassagem());
        System.out.println("Digite a distancia percorrida: ");
        Integer distancia = input.nextInt();
        System.out.println("Pagamento: "+ veiculo.calcularPagamento(distancia, veiculo.emitirPassagem()));
        System.out.println("Digite x1 e x2:");
        Integer x1 = input.nextInt();
        Integer x2 = input.nextInt();
        System.out.println("Digite y1 e y2:");
        Integer y1 = input.nextInt();
        Integer y2 = input.nextInt();
        System.out.println("Tempo de viagem: " + veiculo.calcularTempoViagem(x1, x2, y1, y2));
    }

    public Principal() {
        EmpresaViagem empresaViagem = new EmpresaViagem("Nova empresa", "Eduardo", "Rua alguma coisa", 100f, 60, 20, new Onibus(20, "Grande", "Onibus Empresa"));
        System.out.println(empresaViagem);

        LinkedList<Veiculo> veiculos = new LinkedList<>();
        Barco barcoUm = new Barco(10, 4, "Barco Um");
        Barco barcoDois = new Barco(4, 2, "Barco Dois");
        Onibus onibusUm = new Onibus(30, "Grande", "Onibus Um");
        Onibus onibusDois = new Onibus(10, "Pequeno", "Onibus Dois");
        
        veiculos.add(barcoUm);
        veiculos.add(barcoDois);
        veiculos.add(onibusUm);
        veiculos.add(onibusDois);
        Scanner input = new Scanner(System.in);
        for (Veiculo veiculo: veiculos) {
            System.out.println("\n" + veiculo);
            System.out.println("Rodas: " + veiculo.getRodas() + " - Janelas: " + veiculo.getJanelas() + " - Radios: " + veiculo.getQtdeRadios() + " - Velocidade: " + veiculo.getVelocidade() + " - Combustivel: " + veiculo.getQtdeCombustivel());
            System.out.println("1 - Opcoes de calculo (Passagem/Pagamento/Tempo)\n2 - Continuar\n");
            if (input.nextInt() == 1) {
                calcular(input, veiculo);
            }
        }
        ArrayList<IMoeda> moedas = new ArrayList<>();
        IMoeda moeda = new Real();
        moedas.add(moeda);
        moeda = new BitCoin();
        moedas.add(moeda);
        moeda = new Euro();
        moedas.add(moeda);
        for (IMoeda iMoeda: moedas) {
            System.out.println(iMoeda.converterEmDolar());
        }
        input.close();
    }

    public static void main(String[] args) {
        new Principal();
    }
}
