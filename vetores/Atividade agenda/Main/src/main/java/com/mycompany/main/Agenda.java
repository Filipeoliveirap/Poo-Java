package com.mycompany.main;
public class Agenda {
    private Pessoa[] pessoas;
    int quantidade;

    public Agenda(int capacidade) {
        this.pessoas = new Pessoa[capacidade];
        this.quantidade = 0;
    }
    
    public boolean add(Pessoa p){
        if(quantidade == this.pessoas.length){
            return false;
        }
        this.pessoas[quantidade++] = p;
        return true;
    }
    
    public String getPessoaMaisNova(){
        if(quantidade == 0)
            return null;
        Pessoa pessoaMenor = this.pessoas[0];
        for(int i = 1; i < this.quantidade; i++){
            if(this.pessoas[i].getIdade() < pessoaMenor.getIdade()){
                pessoaMenor = this.pessoas[i];
            }
        }
        return pessoaMenor.getNome();
    }
    
}
