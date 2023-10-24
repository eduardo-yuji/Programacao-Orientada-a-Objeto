/*
Exercicio 2
Autor(es): João Vitor Levorato de Souza e Eduardo Yuji Yoshida Yamada
Data: 10/10/2023
*/

package Exercicio2;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
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
        input.close();
    }

    public static void main(String[] args) {
        new Principal();
    }
}
