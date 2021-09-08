package com.company.JogadorFutebol;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Jogador {
    private String nome;
    private String posicao;
    public boolean aposentado= false;

    public Jogador(String nome, String posicao) {
        this.setNome(nome);
        this.setPosicao(posicao);
    }

    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", aposentado=" + aposentado +
                '}';
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




    public String aposentadoria(int dia, int mes, int ano) {

        Calendar cal = GregorianCalendar.getInstance(); // Instancia do Calendar
        int anoAtual = cal.get(Calendar.YEAR); // Pega o Ano atual
        int Idade = anoAtual - ano;//Calcula a idade apenas com os anos
        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);// Pega o dia atual
        int mesAtual = cal.get(Calendar.MONTH);//Pega o mes atual

        if (dia >= diaAtual && mes >= mesAtual) {
            Idade--; // se o dia e o mes do aniversario for menor que dia e mes atual diminuir a idade
        }
        if (Idade == 40) {
            aposentado = false;
            System.out.println(getNome()+ " - " + getPosicao());
            System.out.println("Você nasceu em "+ dia + "/"+ mes + "/" + ano + '\n' +
            "Voce tem " + Idade + " anos de idade voce ja pode pedir aposentaria");

        } else if (Idade < 40) {
            aposentado = false;
            System.out.println(getNome()+ " - " + getPosicao());
            System.out.println("Você nasceu em "+ dia + "/"+ mes + "/" + ano + '\n' +
                    "tem " + Idade + " anos de idade e ainda pode jogar futebol");

        } else {
            aposentado = true;
            System.out.println(getNome()+ " - " + getPosicao());
            System.out.println("Você nasceu em "+ dia + "/"+ mes + "/" + ano + '\n' +
             "tem " + Idade + " anos de idade e está aposentado");

        }
        return String.valueOf(Idade);
    }
}



