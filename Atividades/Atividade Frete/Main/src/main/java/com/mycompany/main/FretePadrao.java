package com.mycompany.main;

public class FretePadrao extends Frete{

    public FretePadrao(double distancia, double precoPorKm) {
        super(distancia, precoPorKm);
    }

    @Override
    public double calcularFrete() {
        return super.getDistancia() * super.getPrecoPorKm();
    }
    
}
