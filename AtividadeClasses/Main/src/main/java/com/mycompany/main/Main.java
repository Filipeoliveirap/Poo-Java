package com.mycompany.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        Usuario u1 = null;
        Livro l1 = null;
        Exemplar e1 = null;
        Emprestimo em1 = null;
        
        System.out.println("What do you want to fill in?");
        System.out.println("[1] to user: ");
        System.out.println("[2] to book: ");
        System.out.println("[3] to exemplary: ");
        System.out.println("[4] to loan: ");
        int option = scanner.nextInt();
        scanner.nextLine();
       
        switch (option) {
            case 1: 
                //User register
                System.out.println("User registration:");
                System.out.println("Name: ");
                String userName = scanner.nextLine();
                System.out.println("Phone: ");
                String userPhone = scanner.nextLine();
                System.out.println("Registration: ");
                String userRegistration = scanner.nextLine();
                System.out.println("CPF: ");
                String userCpf = scanner.nextLine();

                u1 = new Usuario(userName, userPhone, userRegistration, userCpf);
                System.out.println("User registered successfully!");
                break;
                
            case 2:
                //register book
                System.out.println("Register book: ");
                System.out.println("Title: ");
                String bookTitle = scanner.nextLine();
                System.out.println("Author: ");
                String bookAuthor = scanner.nextLine();
                System.out.println("Publisher: ");
                String bookPublisher = scanner.nextLine();
                System.out.println("ISBN: ");
                String bookIsbn = scanner.nextLine();
                System.out.println("Edition: ");
                int bookEdition = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Year: ");
                int bookYear = scanner.nextInt();
                scanner.nextLine();

                l1 = new Livro(bookTitle, bookAuthor, bookPublisher, bookIsbn, bookEdition, bookYear);
                System.out.println("Book registered successfully!");
                break;
                
                
            case 3:
                //Register exemplary
                System.out.println("Register exemplar: ");
                System.out.println("Exemplar code: ");
                int exemplaryCode = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Is it available (true/false)?: ");
                boolean exemplaryCaptive = scanner.nextBoolean();
                scanner.nextLine();
                System.out.println("Is it on borrowed(true/false)?: ");
                boolean exemplaryBorrowed = scanner.nextBoolean();
                scanner.nextLine();

                e1 = new Exemplar (exemplaryCaptive, exemplaryBorrowed, exemplaryCode);
                System.out.println("Exemplary registered successfully!");
                break;
                
            case 4:
                //Register loan
                System.out.println("Register loan: ");
                System.out.println("Loan date(int): ");
                int loanDate = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Expected delivery date: ");
                int expectedDeliveryDate = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Actual delivery date: ");
                int actualDeliveryDate = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Loan Situation: ");
                int situation = scanner.nextInt();
                scanner.nextLine();

                em1 = new Emprestimo(loanDate, expectedDeliveryDate, actualDeliveryDate, situation);
                System.out.println("Loan registered successfully!");
                break;
                
            default: 
                System.out.println("Invalid option.");
                return;
        }    
        
        System.out.println("Do want to [1] view or [2] to edit any registered infomation?");
        int action = scanner.nextInt();
        scanner.nextLine();
        
        if(action == 1){
            //Display information
            System.out.println("[1] User");
            System.out.println("[2] Book");
            System.out.println("[3] Exemplary");
            System.out.println("[4] Loan");
            System.out.println("which information do want to view?: ");
            int viewOption = scanner.nextInt();
            scanner.nextLine();
        
            switch(viewOption){
                case 1:
                
                    System.out.println("User info: " + (u1 != null ? u1.toString(): "no user registered"));
                    break;
            
                case 2:
                    System.out.println("Book info: " + (l1 != null ? l1.toString(): "no book registered"));
                    break;

                case 3:
                    System.out.println("Exemplary info: " + (e1 != null ? e1.toString(): "no exemplary registered"));
                    break;

                case 4: 
                    System.out.println("Loan info: " + (em1 != null ? em1.toString(): "no loan registered"));
                    break;
                
                default: 
                    System.out.println("Invalid option.");
                    break;
            }   
        } else if(action == 2){
            //information edit
            System.out.println("[1] to user");
            System.out.println("[2] to book");
            System.out.println("[3] to exemplary");
            System.out.println("[4] to loan");
            System.out.println("Which infomation do want to edit?: ");
            int editOption = scanner.nextInt();
            scanner.nextLine();
            
            switch (editOption){
                case 1:
                    if(u1 != null){
                        System.out.println("New name: ");
                        u1.setName(scanner.nextLine());
                        System.out.println("New phone: ");
                        u1.setPhone(scanner.nextLine());
                        System.out.println("New registration: ");
                        u1.setRegistration(scanner.nextLine());
                        System.out.println("New CPF: ");
                        u1.setCpf(scanner.nextLine());
                        System.out.println("User update successfully!");
                    }else {
                        System.out.println("No user registered.");
                    }
                    break;
                case 2:
                    if(l1 != null){
                        System.out.println("New title: ");
                        l1.setTitle(scanner.nextLine());
                        System.out.println("New edition: ");
                        l1.setEdition(scanner.nextInt());
                        scanner.nextLine();
                        System.out.println("New author: ");
                        l1.setAuthor(scanner.nextLine());
                        System.out.println("New publisher: ");
                        l1.setPublisher(scanner.nextLine());
                        System.out.println("New year: ");
                        l1.setYear(scanner.nextInt());
                        scanner.nextLine();
                        System.out.println("New ISBN: ");
                        l1.setIsbn(scanner.nextLine());
                        System.out.println("Book updated successfully!");
                    
                    }else{
                        System.out.println("No book registered.");
                    }
                    break;
                    
                case 3:
                    if(e1 != null){
                        System.out.println("New code: ");
                        e1.setCode(scanner.nextInt());
                        scanner.nextLine();
                        System.out.println("New captive: ");
                        e1.setCaptive(scanner.nextBoolean());
                        scanner.nextLine();
                        System.out.println("New borrowed: ");
                        e1.setBorrowed(scanner.nextBoolean());
                        scanner.nextLine();
                        System.out.println("Exemplary updated successfully!");
                        
                    }else{
                        System.out.println("No exemplary registered.");   
                    }
                    break;
                    
                case 4:
                    if(em1 != null){
                        System.out.println("New loan date: ");
                        em1.setLoanDate(scanner.nextInt());
                        scanner.nextLine();
                        System.out.println("New expected delivery date: ");
                        em1.setExpectedDeliveryDate(scanner.nextInt());
                        scanner.nextLine();
                        System.out.println("New actual delivery date: ");
                        em1.setActualDeliveryDate(scanner.nextInt());
                        scanner.nextLine();
                        System.out.println("New situantion: ");
                        em1.setSituation(scanner.nextInt());
                        scanner.nextLine();
                        System.out.println("Loan updated successfuly!");
                        
                    }else{
                        System.out.println("No loan registered.");
                    }
                    break;
            }
        
        System.out.println("[1] to user");
        System.out.println("[2] to book");
        System.out.println("[3] to exemplary");
        System.out.println("[4] to loan");
        System.out.println("What updated do want to see?: ");
        int seeEdit = scanner.nextInt();
        scanner.nextLine();
        
        switch(seeEdit){
            case 1: 
                System.out.println("User updates...");
                System.out.println("User: " + (u1 != null ? u1.toString(): "no user registered."));
                break;
            
            case 2:
                System.out.println("Book updates...");
                System.out.println("Book: " + (l1 != null ? l1.toString(): "no book registered."));
                break;
                
            case 3: 
                System.out.println("Exemplary updates...");
                System.out.println("Exemplary: " + (e1 != null ? e1.toString(): "no exemplary registered"));
                break;
                
            case 4:
                System.out.println("Loan updates...");
                System.out.println("Loan info: " + (em1 != null ? em1.toString(): "no loan registered"));
                break;
            
            default: 
                System.out.println("Invalid option.");
                break;
                
            }
            
        
        
        }
        
        scanner.close();
    }
}