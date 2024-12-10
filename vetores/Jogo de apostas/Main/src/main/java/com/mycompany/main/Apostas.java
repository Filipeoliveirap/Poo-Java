package com.mycompany.main;

import java.util.Scanner;

public class Apostas {
    //attributes
    private int numeros[];

    public Apostas(int tamanho) {
        this.numeros = new int[tamanho];
    }
    
    public void escolherNumeros(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha seus números(3 numeros entre 1 a 10)");
        for(int i = 0; i < 3; i++){
            System.out.println("Número " + (i + 1) + " : ");
            int numero = scanner.nextInt();
            if (numero >= 1 && numero <= 10){
                numeros[i] = numero;
            }
            System.out.println("Número inválido! Escolha um número entre 1 e 10.");
            i--;
        }
        
    }
    
    public void mostrarNumeros(){
        System.out.println("Numeros apostados: ");
        for(int num : numeros){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
    
    
}
