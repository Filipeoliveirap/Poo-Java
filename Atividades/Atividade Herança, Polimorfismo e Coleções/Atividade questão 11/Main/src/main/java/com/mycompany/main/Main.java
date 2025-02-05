package com.mycompany.main;
public class Main {

    public static void main(String[] args) {
        CadastroDeDesenho cadastro = new CadastroDeDesenho();
        
        Desenho retangulo = new Retangulo();
        Desenho circulo = new Circulo();
        Desenho quadrado = new Quadrado();
        Desenho pessoa = new Pessoa();
        
        cadastro.adicionarDesenho(retangulo);
        cadastro.adicionarDesenho(circulo);
        cadastro.adicionarDesenho(quadrado);
        cadastro.adicionarDesenho(pessoa);
        
        cadastro.desenhoTodos();
        
    }
    
   
}
