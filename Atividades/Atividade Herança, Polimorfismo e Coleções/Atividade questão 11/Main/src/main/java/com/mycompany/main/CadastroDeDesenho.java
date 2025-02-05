package com.mycompany.main;
import java.util.ArrayList;
import java.util.List;
public class CadastroDeDesenho {
   private List<Desenho> desenhos;
   
   public CadastroDeDesenho(){
       this.desenhos = new ArrayList<>();
   }
   
   //adicionar o desenho na lista
   public void adicionarDesenho(Desenho desenho){
       desenhos.add(desenho);
   }
   
   public void desenhoTodos(){
       for(Desenho desenho : desenhos){
           desenho.desenhar();
       }
   }
}
