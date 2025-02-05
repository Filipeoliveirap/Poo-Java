package com.mycompany.main;


public class Cachorro implements Animal{

    @Override
    public void andar() {
        System.out.println("Cachorro andando igual a cachorro");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au, au! Au, au...");
    }

    @Override
    public void comer() {
        System.out.println("Cachorro comendo ração...");
    }

    @Override
    public void dormir() {
        System.out.println("Cachorro dormindo no sofá...");
    }
    
}
