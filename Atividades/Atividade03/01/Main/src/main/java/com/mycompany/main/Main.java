package com.mycompany.main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        Helicóptero h1 = new Helicóptero ();
        Helicóptero h2 = new Helicóptero();
        
        HelicópteroMenu menu = new HelicópteroMenu(h1);
        int option = 0;
        do{
            try{
                System.out.println("\n === Main menu ===");
                System.out.println("[1] To manage helicopter 1.");
                System.out.println("[2] To manage helicopter 2.");
                System.out.println("[3] Exit.");
                System.out.println("Choose an Option: ");
                option = scanner.nextInt();
                
                switch(option){
                    case 1 -> {
                        System.out.println("\nManaging helicopter 1:");
                        menu.setHelicóptero(h1);
                        menu.menu();
                    }
                    case 2 -> {
                        System.out.println("\nManaging helicopter 2:");
                        menu.setHelicóptero(h2);
                        menu.menu();
                    }
                    case 3 -> System.out.println("Exiting program");
                    
                    default -> System.out.println("Invalid option. Try again."); 
                }
                if (option != 3){
                    System.out.println("\nPress enter to return the menu...");
                    scanner.nextLine();
                    scanner.nextLine();
                }
                
            } catch (Exception e ){
                 System.out.println("Invalid input. plese put a number");
                 scanner.nextLine();
            }
        } while(option != 3);
        scanner.close();
        
    }
}
