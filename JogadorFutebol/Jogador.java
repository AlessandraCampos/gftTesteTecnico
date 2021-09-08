package com.company.JogadorFutebol;

import com.sun.jdi.DoubleType;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Jogador {
    private String nome;
    private String posição;
    private Date datanascimento;
    public boolean aposentado;

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", posição='" + posição + '\'' +
                ", datanascimento=" + datanascimento +
                " 'aposentado }'" + aposentado;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosição() {
        return posição;
    }

    public void setPosição(String posição) {
        this.posição = posição;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String aposentadoria(int Dia, int Mes, int Ano) {

        Calendar cal = GregorianCalendar.getInstance(); // Instancia do Calendar
        int anoAtual = cal.get(Calendar.YEAR); // Pega o Ano atual
        int Idade = anoAtual - Ano;//Calcula a idade apenas com os anos
        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);// Pega o dia atual
        int mesAtual = cal.get(Calendar.MONTH);//Pega o mes atual
        if (Dia >= diaAtual && Mes >= mesAtual) {
            Idade--; // se o dia e o mes do aniversario for menor que dia e mes atual diminuir a idade
        }
        if (Idade == 40) {
            System.out.println(" Você tem " + Idade + " anos de idade");
            System.out.println(" Voce ja pode se aposentar");
            aposentado = false;
        } else if (Idade < 40) {
            System.out.println(" Você tem " + Idade + " anos de idade");
            System.out.println(" Voce ainda pode jogar futebol");
            aposentado = false;
        } else {
            System.out.println(" Está aposentado");
            aposentado = true;
        }
        return String.valueOf(Idade);
    }
}



