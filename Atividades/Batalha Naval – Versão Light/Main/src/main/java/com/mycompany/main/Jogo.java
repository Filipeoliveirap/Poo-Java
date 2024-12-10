package com.mycompany.main;

import java.util.Scanner;

public class Jogo {
    //attributes
    private Jogador jogador1;
    private Jogador jogador2;
    
    //constructor

    public Jogo(String nomeJogador1, String nomeJogador2) {
        jogador1 = new Jogador(nomeJogador1);
        jogador2 = new Jogador(nomeJogador2);
    }

    //methods
    
    public void iniciarJogo(){
        Scanner scanner = new Scanner(System.in);
        jogador1.inicializarTabuleiro();
        jogador2.inicializarTabuleiro();
        
        System.out.println(jogador1.getNome() + ", posicione suas suas armas:");
        jogador1.posicionarArmas(scanner);
        
        System.out.println(jogador2.getNome()+ ", posicione suas armas:");
        jogador2.posicionarArmas(scanner);
        
        boolean jogoAtivo = true;
        Jogador jogadorAtual = jogador1;
        Jogador adversario = jogador2;
        
        while(jogoAtivo){
            System.out.println(jogadorAtual.getNome() + ", sua vez! ");
            jogadorAtual.atirar(adversario, scanner);
            
            if(adversario.todasArmasDestruidas()){
                System.out.println("\n" + jogadorAtual.getNome() + "venceu o jogo!");
                jogoAtivo = false;
            } else{
                Jogador temp = jogadorAtual;
                jogadorAtual = adversario;
                adversario = temp;
            } 
        }
        scanner.close();
    }
}    