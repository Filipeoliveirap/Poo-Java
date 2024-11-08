package com.mycompany.calendariomain;
public class CalendarioMain {

    public static void main(String[] args) {
        Calendario c1 = new Calendario(15, 3, 2024);
        Calendario c2 = new Calendario(10, 8, 2023);
        
        
        
        System.out.println("Showing calendar c1 data: ");
        c1.showDate();
        c1.leapYear();
        
        
        System.out.println("Showing calendar c2 data");
        c2.showDate();
        c2.leapYear();
    
    
    }
}
