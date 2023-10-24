/*
Exercicio 1
Autor(es): João Vitor Levorato de Souza e Eduardo Yuji Yoshida Yamada
Data: 10/10/2023
*/

package Exercicio1;

import java.util.LinkedList;

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

        for (Veiculo veiculo: veiculos) {
            System.out.println(veiculo);
        }
    }

    public static void main(String[] args) {
        new Principal();
    }
}
