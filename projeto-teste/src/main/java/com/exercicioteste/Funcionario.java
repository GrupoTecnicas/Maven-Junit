package com.exercicioteste;

public class Funcionario {
    private static final double LIM_INSS = 5000.0;
    private static final double LIM_IRPF = 2500.0;
    private double salarioBruto;

    public Funcionario() {
        salarioBruto = 0.0;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        if (salarioBruto >= 0.0) {
            this.salarioBruto = salarioBruto;
        }
    }

    public double getINSS() {
        if (salarioBruto < LIM_INSS) {
            return salarioBruto * 0.45; // Erro
        } else {
            return LIM_INSS * 0.045;
        }
    }

    public double getIRPF() {
        if (salarioBruto <= LIM_IRPF) {
            return 0.0;
        } else {
            return (salarioBruto - LIM_INSS) * 0.012; // Erro
        }
    }

    public double getSalarioLiquido(){
        return getSalarioBruto()-getINSS()-getIRPF();
    }
}