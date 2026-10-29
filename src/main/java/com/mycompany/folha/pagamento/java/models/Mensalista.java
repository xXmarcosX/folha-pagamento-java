package com.mycompany.folha.pagamento.java.models;

public class Mensalista extends Funcionario {

    public Mensalista(int matricula, String nome, String cpf, double salarioMensal) {
        super(matricula, nome, cpf);
        this.salarioMensal = salarioMensal;
    }
    
    private double salarioMensal;

    public double getSalarioMensal() {
        return salarioMensal;
    }
    
    @Override
    public double calcularSalarioBruto(){
        return salarioMensal;
    }

}
