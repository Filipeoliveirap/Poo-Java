package com.mycompany.main;


public class Gato implements Animal {

    @Override
    public void andar() {
        System.out.println("Andando igual a um gato");
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau, miau! Miau...");
    }

    @Override
    public void comer() {
        System.out.println("Gato comendo peixe...");
    }

    @Override
    public void dormir() {
        System.out.println("Gato dormindo no colo...");
    }
    
}
