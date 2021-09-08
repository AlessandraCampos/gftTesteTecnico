package com.company.ContaBancaria;

public abstract class Conta{
        public int numero;
        public String titular;
        public float saldo;

        public double rendimentos(){
            saldo = this.saldo;
            return saldo;
        }

}
