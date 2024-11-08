package com.mycompany.nssmain;
public class Funcionarios {
    //attributes
    
    private int code;
    private String name, CPF, address, phone;
    private int age;
    private double salary;
    
    //constructors
    
    public Funcionarios(int code, String name, String CPF, String address, String phone, int age, double salary){
        this.code = code;
        this.name = name;
        this.CPF = CPF;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.salary = salary;
    }
    
    //methods
    
    public int getCode(){
        return code;
    }
    
    public void setCode(int code){
        this.code = code;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getCpf(){
        return CPF;
    }
    
    public void setCpf(String CPF){
        this.CPF = CPF;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return String.format("Employee {code=%d, name='%s', CPF='%s', address='%s', phone='%s', age=%d, salary=%.2f}",
                code, name, CPF, address, phone, age, salary);
                
    }
    
    //methods to calculate net salary
    public double calculateNetSalary(){
        return salary - (salary * 0.11);
    }





}


