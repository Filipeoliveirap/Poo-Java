package com.mycompany.main;
import java.util.Scanner;
public class Jogador {
    //attributes 
    private String nome;
    private char[][] meuJogo;
    private char[][] jogoDoAdversario;
    
    //constructor
    public Jogador(String nome){
        this.nome = nome;
        this.meuJogo = new char[8][8];
        this.jogoDoAdversario = new char[8][8];
    }
    
    public void inicializarTabuleiro(){ //montando os tabuleiros.
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                this.meuJogo[i][j] = '|';
                this.jogoDoAdversario[i][j] = '|';
            }
        }
    }
    
    public void atirar(Jogador adversario, Scanner scanner){
        int linha, coluna;
        boolean coordenadasValidas;
        
        do{
            System.out.println("COORDENADAS PARA PARA ATIRAR");
            System.out.println("Informe a linha (0-7: ");
            linha = scanner.nextInt();
            System.out.println("Informe a coluna (0-7): ");
            coluna = scanner.nextInt();
            coordenadasValidas = (linha >= 0 && linha < 8 && coluna >= 0 && coluna < 8);
            
            if(!coordenadasValidas){
                System.out.println("Coordenadas inválidas. Tente novamente.");
            }
        } while(!coordenadasValidas);    
        
        boolean acertou = adversario.verificarSeAcertou(linha,coluna);
        
        if(acertou){
            System.out.println("Acertou uma arma!");
            this.jogoDoAdversario[linha][coluna] = 'X';
        }else{
            System.out.println("Água!");
            this.jogoDoAdversario[linha][coluna] = 'O';
        }
    }
    
    public boolean verificarSeAcertou(int linha, int coluna){
        if(this.meuJogo[linha][coluna] != '|'){
            this.meuJogo[linha][coluna] = 'X';
            return true;
        }
        return false;
    }
    
    public void posicionarArmas(Scanner scanner){
        while (!todasArmasPosicionadas()){
            //submarinos
            for (int i = 0; i < 3; i++){
                boolean armaPosicionada = false;
                while (!armaPosicionada){
                    System.out.println("Informe a posição para o submarino #" + (i+1) + "(linha e coluna): ");
                    int linha = scanner.nextInt();
                    int coluna = scanner.nextInt();
                    
                    if (coordenadasValidas(linha, coluna)){
                        meuJogo[linha][coluna] = 's';
                        armaPosicionada = true;
                    } else{
                        System.out.println("Coordenadas invalidas ou sobreposição de armas. Tente novamente.");
                    }
                }
            }
            //cruzadores
            for (int i = 0; i < 2; i++){
                boolean armaPosicionada = false;
                while (!armaPosicionada){
                    System.out.println("Informe a posição do cruzador #" + (i+1) + "(linha e coluna): ");
                    int linha = scanner.nextInt();
                    int coluna = scanner.nextInt();
                    
                    if (coordenadasValidas(linha, coluna)){
                        meuJogo[linha][coluna] = 'c';
                        armaPosicionada = true;
                    }else { 
                        System.out.println("Coordenadas invalidas ou sobreposição de armas. Tente novamente.");
                    }
                }
            }
            //porta-aviões
            boolean armaPosicionada = false;
            while (!armaPosicionada){
                System.out.println("Informe a posição do porta-avião (linha e coluna) :");
                int linha = scanner.nextInt();
                int coluna = scanner.nextInt();
                
                if (coordenadasValidas(linha, coluna)){
                    meuJogo[linha][coluna] = 'p';
                    armaPosicionada = true;
                } else {
                    System.out.println("Coordenads invalidas ou sobreposição de armas. Tente novamente.");
                }
            }
        }    
    }
    
    public boolean todasArmasPosicionadas(){
        int submarinosPosicionados = 0;
        int cruzadoresPosicionados = 0;
        int portaAvioesPosicionados = 0;
        
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                char arma = meuJogo[i][j];
                if(arma == 's'){
                    submarinosPosicionados++;
                } else if(arma == 'c'){
                    cruzadoresPosicionados++;
                } else if(arma == 'p'){
                    portaAvioesPosicionados++;
                }
            }
        }
        
        int totalSubmarinos = 3;
        int totalCruzadores = 2;
        int totalPortaAvioes = 1;
        
        return submarinosPosicionados == totalSubmarinos && cruzadoresPosicionados == totalCruzadores && portaAvioesPosicionados == totalPortaAvioes;
    }
    
    public boolean coordenadasValidas(int linha, int coluna){
        if(linha < 0 || linha >= 8 || coluna < 0 || coluna >= 8 ){
            System.out.println("Coordenadas fora do limite do tabuleiro!");
            return false;
        }
        
        if(meuJogo[linha][coluna] != '|'){
            System.out.println("Essa posição ja esta ocupada por outra arma!");
            return false;
        }
        
        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                int novaLinha = linha + i;
                int novaColuna = coluna + j;
                if( i == 0 && j == 0){
                    continue;
                }
                if(novaLinha >= 0 && novaLinha < 8 && novaColuna >= 0 && novaColuna < 8){
                    if(meuJogo[novaLinha][novaColuna] != '|'){
                        System.out.println("Não é possível colocar arma aqui. Já existe uma arma nesse local.");
                        return false;
                    }
                }
            }    
        }
        
        return true;
    }
    
    public boolean resgistrarTiro(int linha, int coluna){
        if (linha < 0 || linha >= 8 || coluna < 0 || coluna >= 8){
            System.out.println("Coordenadas fora do limite.");
            return false;
        }
        
        if (meuJogo[linha][coluna] == 'X' || meuJogo[linha][coluna] == 'O'){
            System.out.println("Você já atirou nessa posição");
            return false;
        }
        
        if (meuJogo[linha][coluna] == 's' || meuJogo[linha][coluna] == 'c' || meuJogo[linha][coluna] == 'p'){
            meuJogo[linha][coluna] = 'X';
            System.out.println("Acertou uma arma!");
            return true;
        }
        
        meuJogo[linha][coluna] = 'O';
        System.out.println("Água!");
        return false;
    }
    
    public boolean todasArmasDestruidas(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(meuJogo[i][j] == 's' || meuJogo[i][j] == 'c' || meuJogo[i][j] == 'p'){
                    return false;
                }
            }
        }
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char[][] getMeuJogo() {
        return meuJogo;
    }

    public void setMeuJogo(char[][] meuJogo) {
        this.meuJogo = meuJogo;
    }

    public char[][] getJogoDoAdversario() {
        return jogoDoAdversario;
    }

    public void setJogoDoAdversario(char[][] jogoDoAdversario) {
        this.jogoDoAdversario = jogoDoAdversario;
    }
}
