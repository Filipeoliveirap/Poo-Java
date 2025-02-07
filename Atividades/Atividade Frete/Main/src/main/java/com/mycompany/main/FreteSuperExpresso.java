package com.mycompany.main;

public class FreteSuperExpresso extends Frete{
    private double valorDoSeguro;
    private int nivelUrgencia;

    public FreteSuperExpresso(double distancia, double precoPorKm, double valorDoSeguro, int nivelUrgencia) {
        super(distancia, precoPorKm);
        this.valorDoSeguro = valorDoSeguro;
        this.nivelUrgencia = nivelUrgencia;
    }

    @Override
    public double calcularFrete() {
        return (super.getDistancia() * super.getPrecoPorKm()) + (this.nivelUrgencia * 100 + this.valorDoSeguro);
    }
}
