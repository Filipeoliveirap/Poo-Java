package com.mycompany.main;
public class Main {

    public static void main(String[] args) {
        
        Guerreiros g1 = new Guerreiros("Rocky");
        Guerreiros g2 = new Guerreiros("Apollo");
        
        Jogo jogo = new Jogo();
        
        GuerreirosMenu menu = new GuerreirosMenu(g1, g2, jogo);
        
        menu.menu();
        
    }
}