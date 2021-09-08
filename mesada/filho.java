package com.company.mesada;

public class filho extends mesada {

    @Override
    public void pagarMesada(double quantia,boolean apronta) {
     if(apronta == false){
         this.setQuantia(quantia - 0.01);
         System.out.println("Este filho apronta? " + apronta +
                 " A mesada foi de " + getQuantia());
     }else{
      this.setQuantia(quantia - 0.05) ;
         System.out.println("Este filho apronta? " + apronta +
                 " A mesada foi de " + getQuantia());
     }
    }
}
