package com.company.ContaBancaria;

public class ContaPoupanca extends Conta {
    private double valorMinimo =500;
    public Double getValorMinimo() {
        return valorMinimo;
    }

    public ContaPoupanca(float deposito) {
        saldo = deposito;
        if (deposito < valorMinimo){
            System.out.println("O valor minimo é de R$500,00");
        }else{
            System.out.println("Seu saldo é de :" + (rendimentos()));
        }
    }

    public void setValorMinimo(Double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }


    @Override
    public double rendimentos() {
        super.rendimentos();
        return this.saldo += saldo * 0.07;
    }
}
