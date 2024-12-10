package com.mycompany.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda(4);
        String nome, telefone;
        int idade;
    
        for(int i = 0; i < 4; ++i){
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();
            System.out.println("Digite seu tefefone: ");
            telefone = scanner.nextLine();
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
            scanner.nextLine();
            
            if (agenda.add(new Pessoa(nome, telefone, idade))) {
            System.out.println("Pessoa adicionada com sucesso!");
            } else {
            System.out.println("Agenda cheia! Não foi possível adicionar.");
            }
        }
        
        System.out.println("Nome da pessoa mais nova: ");
        System.out.println(agenda.getPessoaMaisNova());
    }
}
