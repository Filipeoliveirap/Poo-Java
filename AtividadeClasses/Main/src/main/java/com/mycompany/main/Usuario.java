package com.mycompany.main;
public class Usuario {
    //Attributes
    private String name, phone, registration, CPF;
    
    //Constructor
    public Usuario(String name, String phone, String registration, String CPF){
        this.name = name;
        this.phone = phone;
        this.registration = registration;
        this.CPF = CPF;
    }
    
    //Methods
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getRegistration(){
        return registration;
    }

    public void setRegistration(String registration){
        this.registration = registration;
    }

    public String getCpf(){
        return CPF;
    }
    
    public void setCpf(String CPF){
        this.CPF = CPF;
    }
    
    @Override
    public String toString(){
        return "name: " + name + ", phone: " + phone + ", Registration: " + registration + ", CPF: " + CPF;
    }


}
