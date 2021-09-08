package com.company;

import java.util.Scanner;

public class Crianca {
    public Crianca(String nome, String personalidade) {
        this.nome = nome;
        this.personalidade = personalidade;
        entregapresente();

    }

       private String nome;
       private String personalidade;
       public int entregues = 0;
       public int naoEntregues=0;

    public String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        nome= nome;
    }

    @Override
    public String toString() {
        return "Crianca{" +
                "nome='" + nome + '\'' +
                ", personalidade='" + personalidade + '\'' +
                '}'  ;
    }

    public String getPersonalidade() {
        return personalidade;
    }

    public static void setPersonalidade(String personalidade) {
         personalidade = personalidade;

    }
    public void entregapresente(){

        if (personalidade.equalsIgnoreCase("Boazinha")){
            entregues ++;
            System.out.println(this.nome + " Ganhou Presente ");
        }else{
            naoEntregues ++;
            System.out.println(this.nome + " Não Ganhou Presente ");
        }
        System.out.println("Total de presentes entregues " + entregues +
                " Total não entregues " + naoEntregues);

    }



}



