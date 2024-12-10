package com.mycompany.main;
public class Helicóptero {
    //Attributes
    private boolean connected;
    private int altitude;
    private int capacity;
    
    //Constructor
    public Helicóptero(){
        this.connected = false;
        this.capacity = 0;
        this.altitude = 0;
    }
    
    //methods
    
    public void addPerson(){
        if(this.getCapacity() < 5){
            this.setCapacity(this.getCapacity()+ 1);
            System.out.println("Person added successfully! Current number of people aboard: " + this.getCapacity());
            
        }else{
            System.out.println("Insuffcient space.");
        }
    }
    
    public void removePerson(){
        if(this.getCapacity() > 0){
            this.setCapacity(this.getCapacity() - 1);
            System.out.println("Person removed successfully. Current number of people aboard: " + this.getCapacity());
            
        }else{
            System.out.println("There are no people to remove.");
        }
    }
    
    public void toTurnOn(){
       if(this.isConnected()){
           System.out.println("Helicopter is already turned on");
       } else if(this.getAltitude() == 0){
           this.setConnected(true);
           System.out.println("Helicopter turned on.");
       } else{
           System.out.println("Cannot turn on the helicopter while it is the air.");
       }
    }
        
    public void takeOff(){
        if(!this.isConnected()){
            System.out.println("Helicopter cannot take off. It is turned off.");
        } else if (this.getAltitude()== 1){
            System.out.println("Helicopter is already in the air.");
        }else if (this.getCapacity() == 0){
            System.out.println("Helicopter cannot take off. There are no people aboard.");
        }else if (this.getCapacity() > 5){
            System.out.println("Helicopter cannot take off there are more than 5 people.");
        } else{
            this.setAltitude(1);
            System.out.println("Helicopter took off.");
        }
    }
    
    public void land(){
        if(!this.isConnected()){
            System.out.println("Helicopter cannot land because it is turned off.");
        } else if(this.getAltitude() == 0){
            System.out.println("Helicopter is already on the ground.");
        } else{
            this.setAltitude(0);
            System.out.println("Helicopter landed. Current number of people aboard: " + this.getCapacity());
        }
    }
    
    public void shutDown(){
        if(this.isConnected()){
            if(this.getAltitude() == 1){
            System.out.println("Cannot shut down the helicopter while it is in the air.");
            } else{
            this.setConnected(false);
            System.out.println("Helicopter turned off.");
            }
        }else{
            System.out.println("Helicopter is already shut down");
        }
    }    
    
    public void status(){
        System.out.println("There are " + this.getCapacity() + " people aboard");
        System.out.println(this.isConnected() ? "the helicopter is on." : "the helicopter is off.");
        System.out.println(this.getAltitude() == 0 ? "the helicopter in on the ground." : "the helicopter is in the air.");
    }
    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
