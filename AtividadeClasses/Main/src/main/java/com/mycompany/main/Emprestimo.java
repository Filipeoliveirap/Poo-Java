package com.mycompany.main;
public class Emprestimo {
    //Attributes
    private int loanDate, expectedDeliveryDate, actualDeliveryDate, situation;
    
    //Constructor
    public Emprestimo(int loanDate, int expectedDeliveryDate, int actualDeliveryDate, int situation){
        this.loanDate = loanDate;
        this.expectedDeliveryDate = expectedDeliveryDate;
        this.actualDeliveryDate = actualDeliveryDate;
        this.situation = situation;
    }
    
    //methods
    public int getLoanDate(){
        return loanDate;
    }
    
    public void setLoanDate(int loanDate){
        this.loanDate = loanDate;
    }

    public int getExpectedDeliveryDate(){
        return expectedDeliveryDate;
    }
    
    public void setExpectedDeliveryDate(int expectedDeliveryDate){
        this.expectedDeliveryDate = expectedDeliveryDate;
    }
    
    public int getActualDeliveryDate(){
        return actualDeliveryDate;
    }
    
    public void setActualDeliveryDate(int actualDeliveryDate){
        this.actualDeliveryDate = actualDeliveryDate;
    }
    
    public int getSituation(){
        return situation;
    }

    public void setSituation(int situation){
        this.situation = situation;   
    }

    @Override
    public String toString(){
        return "Loan date: " + loanDate + ", Expected delivery date: " + expectedDeliveryDate + ", Actual delivery date: " + actualDeliveryDate + ", Situation: " + situation; 
    }

}
