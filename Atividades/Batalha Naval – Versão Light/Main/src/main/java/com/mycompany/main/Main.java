package com.mycompany.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao Batalha Naval!");
        
        System.out.print("Digite o nome do jogador 1: ");
        String nomeJogador1 = scanner.nextLine();
        
        System.out.print("Digite o nome do jogador 2: ");
        String nomeJogador2 = scanner.nextLine();
        
        Jogo jogo = new Jogo(nomeJogador1, nomeJogador2);
        
        jogo.iniciarJogo();

        scanner.close();
    }
}

