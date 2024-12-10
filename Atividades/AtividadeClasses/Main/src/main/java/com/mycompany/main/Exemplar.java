
package com.mycompany.main;
public class Exemplar {
    //Attribute
    private boolean captive, borrowed;
    private int code;
    
    //Constructor
    public Exemplar(boolean captive, boolean borrowed, int code){
        this.captive = captive;
        this.borrowed = borrowed;
        this.code = code;
    }
    
    //methods
    public boolean getCaptive(){
        return captive;
    }
    
    public void setCaptive(boolean captive){
        this.captive = captive;
    }
    
    public boolean getBorrowed(){
        return borrowed;
    }
    
    public void setBorrowed(boolean borrowed){
        this.borrowed = borrowed;
    }
    
    public int getCode(){
        return code;
    }
    
    public void setCode(int code){
        this.code = code;
    }
    
    @Override
    public String toString(){
        return "Code: " + code + ", Captive: " + captive + ", Borrowed: " + borrowed;
    }
    

}
