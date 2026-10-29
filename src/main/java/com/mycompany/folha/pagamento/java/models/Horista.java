package com.mycompany.folha.pagamento.java.models;

public class Horista extends Funcionario  {
        
    private int horasTrabalhadas;
    private int horasExtras;
    private double valorHora;

    public Horista(int matricula, String nome, String cpf, 
            int horasTrabalhadas, int horasExtras, double valorHora){
          super(matricula, nome, cpf);
          this.horasTrabalhadas = horasTrabalhadas;
          this.horasExtras = horasExtras;
          this.valorHora = valorHora;
    }
      
    @Override 
    public double calcularSalarioBruto(){
      return horasTrabalhadas * valorHora + horasExtras * 1.5 * valorHora;
    }
    
    public double getValorHora() {
        return valorHora;
    }
    
    public int getHorasExtras() {
        return horasExtras;
    }
        
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    
}
