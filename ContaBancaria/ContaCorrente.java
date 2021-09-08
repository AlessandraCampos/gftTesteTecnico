package com.company.ContaBancaria;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class ContaCorrente extends Conta {
    private double valorMinimo =500;

    public ContaCorrente(float deposito) {
        saldo = deposito;
        if (deposito < valorMinimo){
            System.out.println("O valor minimo é de R$500,00");
        }else{
            System.out.println("Seu saldo é de :" + (rendimentos()));
        }
    }

    public double getValorMinimo() {
        return valorMinimo;
    }

    @Override
    public double rendimentos() {
        super.rendimentos();
        return this.saldo += saldo  * 0.05;


    }
}
