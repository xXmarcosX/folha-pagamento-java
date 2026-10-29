package com.mycompany.folha.pagamento.java;

/**
 *
 * @author Marcos Vinicius - 2830482511008
 */

import java.util.ArrayList;
import java.util.List;

import com.mycompany.folha.pagamento.java.models.Comissionado;
import com.mycompany.folha.pagamento.java.models.Funcionario;
import com.mycompany.folha.pagamento.java.models.Gerente;
import com.mycompany.folha.pagamento.java.models.Horista;
import com.mycompany.folha.pagamento.java.models.Mensalista;
import com.mycompany.folha.pagamento.java.models.TabelaINSS;

public class Main {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Mensalista(1001, "Ana Souza", "111.111.111.11", 3500.00f));
        funcionarios.add(new Horista(1002, "Bruno Lima", "222.222.222-22", 160, 10, 15.00f));
        funcionarios.add(new Gerente(1003, "Carla Dias", "333.333.333-33", 6000.00f, 0.20f));
        funcionarios.add(new Comissionado(1004, "DiegoRocha", "444.444.444-44",
                                            2000.00f, 70000.00f, 0.05f));

        for (Funcionario f : funcionarios) {  
            
            double salarioBruto = f.calcularSalarioBruto();
            double inss = tabelaINSS(salarioBruto);
            double salarioLiquido = salarioBruto - inss;
            
            System.out.printf("%d %-12s %-13s %,10.2f%n", f.getMatricula(), f.getNome(),
                    f.getClass().getSimpleName(), f.calcularSalarioBruto(), salarioLiquido
            );
        }    
    }

    private static float tabelaINSS(double salario) {
        TabelaINSS tabela = new TabelaINSS();
        return (float) tabela.calcular(salario);
    }
}