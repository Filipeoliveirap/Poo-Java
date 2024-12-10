
package com.mycompany.quadradomain;


public class Quadrado {
    //attributes
    private int side;
    
    //constructors
    public Quadrado(int side){
        this.side = side;
    }
    
    //methods
    public int calculateSide(){
        int area = (side * side);
        return area;
    }
    
    public int calculatePerimeter(){
        int perimeter = (4 * side);
        return perimeter;
    }
    
    public void print(){
        System.out.println("Side: " + this.side);
        System.out.println("Area: " + this.calculateSide());
        System.out.println("Perimeter: " + this.calculatePerimeter());
    }




}   
