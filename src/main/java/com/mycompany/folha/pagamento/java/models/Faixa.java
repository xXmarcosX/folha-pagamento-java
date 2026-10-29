package com.mycompany.folha.pagamento.java.models;

public class Faixa {
    private double limite;
    private double aliquota;
    private double parcelaADeduzir;

    public Faixa(double limite, double aliquota, double parcelaADeduzir) {
        this.limite = limite;
        this.aliquota = aliquota;
        this.parcelaADeduzir = parcelaADeduzir;
    }
    
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double getAliquota() {
        return aliquota;
    }
    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }
    public double getParcelaADeduzir() {
        return parcelaADeduzir;
    }
    public void setParcelaADeduzir(double parcelaADeduzir) {
        this.parcelaADeduzir = parcelaADeduzir;
    }

    
}
