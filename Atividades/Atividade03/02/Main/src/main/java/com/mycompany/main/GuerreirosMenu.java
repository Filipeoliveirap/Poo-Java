package com.mycompany.main;

import java.util.Scanner;

public class GuerreirosMenu {
    private Guerreiros g1;
    private Guerreiros g2; 
    private Jogo jogo;
    
    public GuerreirosMenu(Guerreiros g1, Guerreiros g2, Jogo jogo){
        this.g1 = g1;
        this.g2 = g2;
        this.jogo = jogo;
    }
    
    public void exibirMenuPrincipal(){
        System.out.println("\n ===GUERREIROS DA POO MENU === ");
        System.out.println("[1] Lutar.");
        System.out.println("[2] Alimentar.");
        System.out.println("[3] Lutar com recursividade");
        System.out.println("[4] Lutar novamente");
        System.out.println("{5} Restaurar vida para 5");
        System.out.println("[6] Sair.");
        System.out.println("Escolha uma opção: ");
    }
         
    
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        
        
        do{
            try{
                exibirMenuPrincipal();
                option = scanner.nextInt();
                
                switch(option){
                    case 1 -> jogo.iniciarLuta(g1, g2);
                    case 2 -> {
                        int lutador = 0;
                        System.out.println("[1] " + g1.getNome());
                        System.out.println("[2] " + g2.getNome());
                        System.out.println("Qual guerreiro você quer alimentar ?");
                        lutador = scanner.nextInt();
                        if (lutador == 1){
                            g1.alimentar();
                            
                        }else if (lutador == 2){
                            g2.alimentar();
                            
                        }else {
                            System.out.println("Opção invalida. Escolha 1 ou 2.");
                        } 
                    }case 3 -> jogo.iniciarLutaRecursiva(g1, g2);
                    case 4 -> {
                        g1.restaurarEnergia();
                        g2.restaurarEnergia();
                        System.out.println("Energia de " + g1.getNome() + " e " + g2.getNome() + " Restauradas para 5. Prontos para lutar de novo.");
                        jogo.iniciarLuta(g1, g2);
                    }
                    case 5 ->{
                        g1.vidaCheia();
                        g2.vidaCheia();
                    } 
                    case 6 -> System.out.println("Saindo...");    
                    default -> System.out.println("Opção invalida. Tente novamente.");
                }
                if (option != 6) {
                    System.out.println("\nPress Enter to return the menu...");
                    scanner.nextLine();
                    scanner.nextLine();
                }
            }catch(Exception e){
                System.out.println("Entrada invalida. Insira uma entrada válida.");
                scanner.nextLine();
            }
        }while (option != 6);
        
        scanner.close();
    }
    
}
