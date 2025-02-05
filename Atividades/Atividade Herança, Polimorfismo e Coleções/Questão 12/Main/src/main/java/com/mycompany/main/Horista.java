package com.mycompany.main;
    
public class Horista extends Empregado {
    
    private double precoHora, horasTrabalhadas;
    
    public Horista(String nome, String sobrenome, String cpf, double precoHora, double horasTrabalhadas) {
        super(nome, sobrenome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.precoHora = precoHora;
    }

    @Override
    public double vencimento() {
        return precoHora * horasTrabalhadas;
    }
    
}
