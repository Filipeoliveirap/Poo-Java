package com.mycompany.main;
import java.util.HashSet;
import java.util.Set;

public class FolhaDePagamento {
    private Set<Empregado> funcionarios;
    
    public FolhaDePagamento(){
        this.funcionarios = new HashSet<>();
        
    }
    
    public void adicionarFuncionario(Empregado funcionario){
        if(!funcionarios.add(funcionario)){
            System.out.println("Funcionário ja existe na folha de pagamento.");
        } else{
            System.out.println("Funcionario adicionado com sucesso: " + funcionario.getNome());
        }
    }
    
    public void exibirTodos(){
        System.out.println("\n--- Funcionários e Vencimentos ---");
        for(Empregado funcionario : funcionarios){
            System.out.println("Nome: " + funcionario.getNome() + " " + funcionario.getSobrenome() + ", CPF: " + funcionario.getCpf() + ", Vencimento: R$" + funcionario.vencimento());
        }
    }
    
    public void calcularValorTotal(){
        double total = 0;
        for (Empregado funcionario : funcionarios){
            total += funcionario.vencimento();//Aqui ocorre o polimorfismo porque funcionario é declarado do tipo Empregado, mas pode se referenciar a qualquer uma das subclasses.
        }
        
        System.out.println("\n Valor total da Folha de Pagamento ---");
        System.out.println("Total: R$" + total);
    }
    
}
