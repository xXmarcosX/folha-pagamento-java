package com.mycompany.folha.pagamento.java.models;

public class Comissionado extends Mensalista{
    
    private double valorVendas;
    private double percComissao;

    public Comissionado(int matricula, String nome, String cpf, double salarioMensal, 
            double valorVendas, double percComissao){
            super(matricula, nome, cpf, salarioMensal);
            this.percComissao = percComissao;
            this.valorVendas = valorVendas;
    }
    
    @Override 
    public double calcularSalarioBruto(){
      double base = super.calcularSalarioBruto();
      return base + valorVendas * percComissao;
    }
    
    public double getPercComissao() {
        return percComissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

}
