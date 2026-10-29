package com.mycompany.folha.pagamento.java.models;

public abstract class Funcionario {

    private int matricula;
    private String nome;
    private String cpf;

    public Funcionario(int matricula, String nome, String cpf) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularSalarioBruto();
}
