package com.mycompany.main;

public class FreteExpresso extends Frete {
    
    private int nivelUrgencia;

    public FreteExpresso(double distancia, double precoPorKm, int nivelUrgencia) {
        super(distancia, precoPorKm);
        this.nivelUrgencia = nivelUrgencia;
    }

    @Override
    public double calcularFrete() {
        return (super.getDistancia() * super.getPrecoPorKm()) + (this.nivelUrgencia * 100);
    }
    
}
