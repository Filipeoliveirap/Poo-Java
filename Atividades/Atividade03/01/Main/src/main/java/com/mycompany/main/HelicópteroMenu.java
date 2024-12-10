package com.mycompany.main;
import java.util.Scanner;

public class HelicópteroMenu {
    private Helicóptero helicoptero;

    public HelicópteroMenu(Helicóptero helicoptero) {
        this.helicoptero = helicoptero;
    }
    
    public void menuSegundario(){
        System.out.println("[1] Add a person to the helicopter.");
        System.out.println("[2] Remove a person from the helicopter.");
        System.out.println("[3] Turn on the helicopter.");
        System.out.println("[4] Shut down the helicopter.");
        System.out.println("[5] Take off.");
        System.out.println("[6] Land the helicopter.");
        System.out.println("[7] show helicopter status");
        System.out.println("[8] Exit.");
        System.out.print("Choose an option: ");
    }
    
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            try {
                menuSegundario();
                option = scanner.nextInt();

                switch (option){
                    case 1 -> helicoptero.addPerson();
                    case 2 -> helicoptero.removePerson();
                    case 3 -> helicoptero.toTurnOn();
                    case 4 -> helicoptero.shutDown();
                    case 5 -> helicoptero.takeOff();
                    case 6 -> helicoptero.land();
                    case 7 -> helicoptero.status();
                    case 8 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid option. Please try again.");
                }
                if (option != 8) {
                    System.out.println("\nPress Enter to return the menu...");
                    scanner.nextLine(); 
                    scanner.nextLine(); 
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); 
            }
        } while (option != 8);

        scanner.close();
    }
    public void setHelicóptero(Helicóptero helicoptero){
        this.helicoptero = helicoptero;
        System.out.println("Swited to a new helicopter.");
    }
}