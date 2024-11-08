package com.mycompany.calendariomain;
public class Calendario {
    //attributes
    
    private int day;
    private int month;
    private int year;
    
    //constructor
    
    public Calendario(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    //mothods
    
    public String monthName(int m){
        String monthName;
        
        switch (m) {
            case 1 :
                monthName = "January";
                break;
            
            case 2 :
                monthName = "February";
                break;
                
            case 3 :
                monthName = "March";
                break;
                
            case 4 :
                monthName = "April";
                break;
                
            case 5 :
                monthName = "May";
                break;
                
            case 6 :
                monthName = "June";
                break;
                
            case 7 : 
                monthName = "July";
                break;
                
            case 8 :
                monthName = "August";
                break;
                
            case 9 : 
                monthName = "September";
                break;
                
            case 10 :
                monthName = "October";
                break;
                
            case 11 : 
                monthName = "November";
                break;
            
            case 12 : 
                monthName = "December";
                break;
                
            default :
                monthName = "invalid month";
                break;
           
        }
        
        return monthName;
    }
    
    public void showDate(){
        String monthName = monthName(this.month);
        if(!monthName.equals("invalid month")){
            System.out.printf("%d of %s of %d\n", this.day, monthName, this.year);
            
        }else {
            System.out.println("Invalid date.");
        }
    }
    
    public void leapYear(){
        if((this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)){
            System.out.println(this.year + " is a year leap");
            
        }else {
            System.out.println(this.year + " is not a leap year");
            
        }
        
    }
    
}