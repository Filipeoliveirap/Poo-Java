package com.mycompany.main;

import java.util.ArrayList;
import java.util.List;

public class CadastroFrete {
    private List<Fretavel> fretes;
    
    public CadastroFrete(){
        this.fretes = new ArrayList<>();
    }
    
    public void adicionaFrete(Fretavel Frete){
        fretes.add(Frete);
    }
    
    public double calcularValorTotal(){
        double total = 0;
        for(Fretavel frete : fretes){
            total += frete.calcularFrete(); //Aqui ocorre o polimorfismo, o método calcular frete foi interado sobre a lista, onde cada classe executará de uma forma.
        }
        
        return total;
    }
}
