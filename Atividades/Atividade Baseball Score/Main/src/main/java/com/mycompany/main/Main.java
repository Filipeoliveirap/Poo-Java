package com.mycompany.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Lendo a entrada como uma unica linha e divindo as operações
        String[] ops = sc.nextLine().split(" ");
        
        //Cria uma instância do jogo e processa as operações
        Game game = new Game();
        int resultado = game.playGame(ops);
        
        //resultado
        System.out.println(resultado);
    }
}
