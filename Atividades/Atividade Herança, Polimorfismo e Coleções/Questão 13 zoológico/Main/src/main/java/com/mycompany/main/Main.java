package com.mycompany.main;

public class Main {

    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();

        Animal cachorro = new Cachorro();
        Animal galinha = new Galinha();
        Animal gato = new Gato();
        Animal papagaio = new Papagaio();

        zoo.adicionar(cachorro);
        zoo.adicionar(galinha);
        zoo.adicionar(gato);
        zoo.adicionar(papagaio);

        zoo.animarBicharada();

        zoo.alimentarTodos();

        zoo.descansarTodos();
    }
}
