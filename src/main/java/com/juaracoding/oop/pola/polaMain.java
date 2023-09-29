package com.juaracoding.oop.pola;

public class polaMain {

    public static void main(String[] args) {

        persegi Persegi = new persegi(5);
        Persegi.draw();
        System.out.println(Persegi.luas());

        segitiga Segitiga = new segitiga(5,7);
        Segitiga.draw();
        System.out.println(Segitiga.luas());
    }
}
