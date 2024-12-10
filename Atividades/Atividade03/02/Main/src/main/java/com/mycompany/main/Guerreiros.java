package com.mycompany.main;
import java.util.Random;
public class Guerreiros {
    
    //attributes
    private int código;
    private String nome;
    private int energia;
    
    //constructor
    public Guerreiros(String nome){
        this.nome = nome;
        this.energia = 5;
    }

    //methods
    public void incremento(){
        if (this.getEnergia() < 5){
            this.setEnergia(this.getEnergia() + 1);
            System.out.println(" Energia aumentada em 1 ponto. Agora voce tem " + this.getEnergia());
            
        }else {
            System.out.println(" Sua energia ja está cheia.");
        }
    }
    
    public void decremento(){
        if (this.getEnergia() > 0){
            this.setEnergia(this.getEnergia() - 1);
            System.out.println(this.getNome() + " perdeu 1 ponto de energia. Energia atual " + this.getEnergia());
            
            if (this.getEnergia() == 0){
                System.out.println(this.getNome() + " está sem energia!");
            }
            
        } else {
            System.out.println(" Já está sem energia");
        }
    }
    
    public void alimentar(){
        if (this.getEnergia() < 5){
            this.incremento();
            
        }else {
            System.out.println("Não é necessário alimentar " + this.getNome() + ". Energia ja cheia.");
        } 
    }
    
    public void restaurarEnergia(){
        this.setEnergia(5);
    }
    
    private int atacar(){
        Random random = new Random();
        return random.nextInt(2);
        
    }
    
    public void lutar(Guerreiros g2){
        if (this.getEnergia() > 0 && g2.getEnergia() > 0){
            int resultadoDoAtaque = this.atacar();
            
            if (resultadoDoAtaque == 1){
                System.out.println(" Ataque com sucesso do " + this.getNome());
                g2.decremento();
                
            }else {
                System.out.println(" Ataque falhou de " + this.getNome());
            }
        }
    }
    
    public void vidaCheia(){
        if(this.getEnergia() < 5){
            this.setEnergia(5);
            System.out.println("Vidas restauradas com sucesso!");
        }
    }
    
    
    public int getCódigo() {
        return código;
    }
    
    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}

