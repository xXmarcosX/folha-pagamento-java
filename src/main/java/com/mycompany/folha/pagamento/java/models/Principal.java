package com.mycompany.folha.pagamento.java.models;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args){

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Mensalista(1001, "Ana Souza", "111.111.111.11", 3500.00));
        funcionarios.add(new Horista(1002, "Bruno Lima", "222.222.222-22",160, 10, 15.00));
        funcionarios.add(new Gerente(1003, "Carla Dias", "333.333.333-33",6000.00,0.20));
        funcionarios.add(new Comissionado(1004,"DiegoRocha", "444.444.444-44",
                                            2000.00,70000.00,0.05));

    for (Funcionario f: funcionarios){ 
        System.out.printf("%d %-12s %-13s %,10.2f%n",f.getMatricula(),f.getNome(),
        f.getClass().getSimpleName(),f.calcularSalarioBruto());
    }    
        
    }    
}