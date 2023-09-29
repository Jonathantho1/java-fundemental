package com.juaracoding.oop.pola;

public class persegi {

    double sisi = 0;

    persegi(double sisi){
        this.sisi = sisi;
    }

    double luas(){
        return sisi*sisi;
    }

    void draw(){
        for (int i = 0; i < sisi;i++){
            for(int j = 0; j<= sisi;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
