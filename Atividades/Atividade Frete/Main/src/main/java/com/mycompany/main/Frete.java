package com.mycompany.main;

public abstract class Frete implements Fretavel {
    //attributes
    private double distancia;
    private double precoPorKm;

    public Frete(double distancia, double precoPorKm) {
        this.distancia = distancia;
        this.precoPorKm = precoPorKm;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getPrecoPorKm() {
        return precoPorKm;
    }
    
    
    
}
