package com.mycompany.folha.pagamento.java.models;

public class Gerente extends Mensalista{

    private double percGratificacao;
    
    public Gerente(int matricula, String nome, String cpf, 
            double salarioMensal, double percGratificacao){
        super(matricula, nome, cpf, salarioMensal);
        this.percGratificacao = percGratificacao;
    }

    @Override 
    public double calcularSalarioBruto(){
      double base = super.calcularSalarioBruto();
      return base * (1 + percGratificacao);
    }
    
    
}
