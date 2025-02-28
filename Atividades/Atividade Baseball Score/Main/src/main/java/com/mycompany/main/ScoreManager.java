package com.mycompany.main;

import java.util.*;

//gerenciar pontuações
public class ScoreManager {
    private Stack<Integer> scores;
    
    public ScoreManager(){
        this.scores = new Stack<>();
    }
    
    //processando uma operação especifica
    
    public void processarOperacao(String operacao){
        if(operacao.equals("C")){
            //remove a ultima pontuação
            scores.pop();
        } else if (operacao.equals("D")){
            // Dobra a ultima pontuação
            int ultimo = scores.peek();
            scores.push(2 * ultimo);
        } else if (operacao.equals("+")){
            //semar as duas Últimas pontuações
            int ultimo = scores.pop();
            int penultimo = scores.peek();
            scores.push(ultimo);
            scores.push(ultimo + penultimo);
        } else{
            //Converter para inteiro e adicionar a pilha
            scores.push(Integer.parseInt(operacao));
        }
    }
    
    //Calculando a soma das pontuações
    public int getTotalScore(){
        int soma = 0;
        for(int score : scores){
            soma += score;
        }
        return soma;
    }
}
