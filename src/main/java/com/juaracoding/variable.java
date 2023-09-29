package com.juaracoding;
import java.awt.*;

public class variable {
    public static void main(String[] args) {
        int a = 100;
        int b = 120;
        float c = 1.4f;
        //explicit besar ke kecil
        int test = (int) c;
        String d = "damai";
        //implicit dari kecil ke besar
        char e = 'w';
        long f = e;

        int umur = 81;
        int duplikatUmur = umur;
        System.out.println(duplikatUmur);
        duplikatUmur = 1308;
        System.out.println(umur);
        System.out.println(duplikatUmur);

        Rectangle kotak = new Rectangle(0, 0, 20, 30);
        Rectangle duplikatKotak = kotak;
        duplikatKotak.setSize(80,90);
        System.out.println(kotak.getSize());
        System.out.println(duplikatKotak.getSize());

        int i = 1891;

        double z = i;

        System.out.println(z);
    }
}
