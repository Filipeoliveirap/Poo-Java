package com.mycompany.main;

public class Main {

    public static void main(String[] args) {
        CadastroFrete cadastroFrete = new CadastroFrete();
        FretePadrao fretePadrao = new FretePadrao(100, 2.5);
        FreteExpresso freteExpresso = new FreteExpresso(150, 3.0, 2);
        FreteSuperExpresso freteSuperExpresso = new FreteSuperExpresso(200, 4.0, 3, 500);

        cadastroFrete.adicionaFrete(fretePadrao);
        cadastroFrete.adicionaFrete(freteExpresso);
        cadastroFrete.adicionaFrete(freteSuperExpresso);

        // Calculando e exibindo o valor total dos fretes cadastrados
        double valorTotal = cadastroFrete.calcularValorTotal();
        System.out.println("Valor total de todos os fretes: R$" + valorTotal);

    }
}
