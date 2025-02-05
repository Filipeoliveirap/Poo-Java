package com.mycompany.main;

public class Main {

    public static void main(String[] args) {

        FolhaDePagamento folha = new FolhaDePagamento();

        Empregado assalariado = new Assalariado("João", "Silva", "123.456.789-00", 5000);
        Empregado comissionado = new Comissionado("Maria", "Souza", "987.654.321-00", 10000, 0.1);
        Empregado horista = new Horista("Pedro", "Almeida", "456.789.123-00", 50, 160);

        folha.adicionarFuncionario(assalariado);
        folha.adicionarFuncionario(comissionado);
        folha.adicionarFuncionario(horista);

        folha.exibirTodos();

        folha.calcularValorTotal();
    }
}
