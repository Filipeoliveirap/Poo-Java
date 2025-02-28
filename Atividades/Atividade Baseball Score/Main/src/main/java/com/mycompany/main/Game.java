package com.mycompany.main;

public class Game {
    private ScoreManager scoreManager;
    
    public Game(){
        this.scoreManager = new ScoreManager();
    }
    
    //processando as operações do jogo
    public int playGame(String[] operacoes){
        for(String operacao : operacoes){
            scoreManager.processarOperacao(operacao);
        }
        return scoreManager.getTotalScore();
    }
}
