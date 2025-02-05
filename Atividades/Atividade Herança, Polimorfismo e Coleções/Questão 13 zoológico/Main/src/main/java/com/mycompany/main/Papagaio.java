package com.mycompany.main;


public class Papagaio implements Animal {

    @Override
    public void andar() {
         System.out.println("Andando igual a um papagaio!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som do papagaio falante...");
    }

    @Override
    public void comer() {
        System.out.println("Papagaio comendo sementes...");
    }

    @Override
    public void dormir() {
        System.out.println("Papagaio dormindo no poleiro...");
    }
    
}
