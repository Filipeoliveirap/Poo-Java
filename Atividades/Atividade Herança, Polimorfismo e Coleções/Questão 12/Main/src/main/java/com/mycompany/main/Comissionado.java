package com.mycompany.main;

public class Comissionado extends Empregado {
    
    private double totalVendas;
    private double taxaComissao;

    public Comissionado(String nome, String sobrenome, String cpf, double totalVendas, double taxaComissao) {
        super(nome, sobrenome, cpf);
        this.taxaComissao = taxaComissao;
        this.totalVendas = totalVendas;
    }

    @Override
    public double vencimento() {
        return totalVendas * taxaComissao;
    }
    
}
