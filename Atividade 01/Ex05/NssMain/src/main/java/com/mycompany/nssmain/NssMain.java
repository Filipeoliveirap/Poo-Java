
package com.mycompany.nssmain;

import java.util.Scanner;

public class NssMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee code: ");
        int code = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter employee name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter employee CPF: ");
        String CPF = scanner.nextLine();
        
        System.out.println("Enter employee address: ");
        String address = scanner.nextLine();
        
        System.out.println("Enter employee phone: ");
        String phone = scanner.nextLine();
        
        System.out.println("Enter employee age: ");
        int age = scanner.nextInt();
        
        System.out.println("Enter employee salary: ");
        double salary = scanner.nextDouble();
        
        Funcionarios f1 = new Funcionarios(code,name, CPF, address, phone, age, salary);
        System.out.println("Employee data before change: ");
        System.out.println(f1);
        
        System.out.println("Enter your new salary: ");
        double newSalary = scanner.nextDouble();
        f1.setSalary(newSalary);
        
        System.out.println("Your salary after change: ");
        System.out.println(f1);
        
        //net salary
        
        double netSalary = f1.calculateNetSalary();
        System.out.printf("Your net salary: %.2f\n", netSalary);
        
        scanner.close();
        
        
        
    }
}
