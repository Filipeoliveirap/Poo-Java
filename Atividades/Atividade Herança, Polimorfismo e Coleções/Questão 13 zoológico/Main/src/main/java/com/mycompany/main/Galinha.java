package com.mycompany.main;


public class Galinha implements Animal{

    @Override
    public void andar() {
        System.out.println("galinha andando....");
    }

    @Override
    public void emitirSom() {
        System.out.println("Cocoricó....");
    }

    @Override
    public void comer() {
        System.out.println("Galinha comendo milho...");
    }

    @Override
    public void dormir() {
        System.out.println("Galinha comendo milho...");
    }
    
}
