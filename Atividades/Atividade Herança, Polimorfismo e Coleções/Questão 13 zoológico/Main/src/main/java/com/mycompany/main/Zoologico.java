package com.mycompany.main;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais;

    public Zoologico() {
        this.animais = new ArrayList<>();
    }

    public void adicionar(Animal animal) {
        animais.add(animal);
        System.out.println("Animal adicionado ao zoológico: " + animal.getClass().getSimpleName());
    }

    public void animarBicharada() {
        System.out.println("\n--- Animais se movendo e emitindo sons ---");
        for (Animal animal : animais) {
            animal.andar(); 
            animal.emitirSom();
        }
    }

    public void alimentarTodos() {
        System.out.println("\n--- Alimentando todos os animais ---");
        for (Animal animal : animais) {
            animal.comer();
        }
    }

    public void descansarTodos() {
        System.out.println("\n--- Animais descansando ---");
        for (Animal animal : animais) {
            animal.dormir(); // Polimorfismo
        }
    }
}
