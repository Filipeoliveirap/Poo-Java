package com.mycompany.main;
public class Jogo {
    public void iniciarLuta(Guerreiros g1, Guerreiros g2){
        System.out.println(g1.getNome() + " VS " + g2.getNome());
        while (g1.getEnergia() > 0 && g2.getEnergia() > 0){
            g1.lutar(g2);
            pausar(2000);
            
            if(g2.getEnergia() > 0){
                g2.lutar(g1);
                pausar(2000);
            }
        }if (g1.getEnergia() > 0){
            System.out.println(g1.getNome() + " venceu!");
            
        }else {
            System.out.println(g2.getNome() + " venceu!");
        }
    }
    
    public void iniciarLutaRecursiva(Guerreiros g1, Guerreiros g2){
        System.out.println(g1.getNome() + " VS " + g2.getEnergia());
        lutarRecursivamente(g1, g2);
    }
    
    private void lutarRecursivamente(Guerreiros g1, Guerreiros g2){
        System.out.println(g1.getNome() + " energia: " + g1.getEnergia());
        System.out.println(g2.getNome() + " energia: " + g2.getEnergia());
        
        if (g1.getEnergia() == 0){
            System.out.println(g2.getNome() + " VENCEU!");
            return;
        
        }else if (g2.getEnergia() == 0){
            System.out.println(g1.getNome() + " VENCEU!");
            return;
        }
        g1.lutar(g2);
        pausar(2000);
        
        if (g2.getEnergia() > 0){
            g2.lutar(g1);
            pausar(2000);
        }
        
        lutarRecursivamente(g1, g2);
    }
    
    public void pausar(int milissegundos){
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e){
            System.out.println("Erro ao pausar o jogo: " + e.getMessage());
        }
    }
    
}   
    
