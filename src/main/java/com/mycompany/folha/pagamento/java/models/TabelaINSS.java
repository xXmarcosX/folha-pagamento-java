package com.mycompany.folha.pagamento.java.models;

import java.util.ArrayList;
import java.util.List;

public class TabelaINSS {
    private List<Faixa> faixas = new ArrayList<>();

    public TabelaINSS() {
        faixas.add(new Faixa(1621.0, 0.075, 0));
        faixas.add(new Faixa(2902.84, 0.09, 0));
        faixas.add(new Faixa(4354.27, 0.12, 0));
        faixas.add(new Faixa(8475.55, 0.12, 0));
    }

    public double calcular(double salario) {
        double total = 0;
        double anterior = 0;

        for (Faixa faixa : faixas) {
            if (salario <= anterior)
                break;

            double teto = Math.min(salario, faixa.getLimite());
            total += (teto - anterior) * faixa.getAliquota();
            anterior = faixa.getLimite();
        }

        return total;
    }
}
