package com.projetono;

public class Main {

    public static void main(String[] args){

        No no1 = new No("Conteúdo no1");

        No no2 = new No("Conteúdo no2");
        no1.setProximoNo(no2);

        No no3 = new No("Conteúdo no3");
        no2.setProximoNo(no3);

        No no4 = new No("Conteúdo no2");
        no3.setProximoNo(no4);

        //no1->no2->no3->no4->null

        System.out.println(no1);


    }
}
