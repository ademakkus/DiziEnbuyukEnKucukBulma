package com.ademakkus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int enKucuk;
        int enBuyuk;
        int diziElemanSayisi;
        int eleman;
        Scanner sc=new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz : ");
        diziElemanSayisi=sc.nextInt();
        int[] sayilar=new int[diziElemanSayisi];
        for (int i=0;i<diziElemanSayisi;i++) {
            System.out.print("Dizinin "+(i+1)+" . elemanı :");
            eleman=sc.nextInt();
            sayilar[i]=eleman;
        }
        enBuyuk=sayilar[0];
        enKucuk=sayilar[0];
        for (int i = 0; i <sayilar.length ; i++) {

            if (enKucuk>sayilar[i]) {
                enKucuk=sayilar[i];
            }
            if(enBuyuk<sayilar[i]){

                enBuyuk=sayilar[i];
            }
        }
        System.out.println("--------------");
        System.out.print("Dizimiz : {");
        for (int elemanlar:sayilar) {
            System.out.print(elemanlar+" ");
        }
        System.out.println("}");
        System.out.println("Dizinin en BÜYÜK elemanı :"+enBuyuk);
        System.out.println("Dizinin en KÜÇÜK elemanı :"+enKucuk);


    }
}
