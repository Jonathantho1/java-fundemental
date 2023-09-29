package com.juaracoding.oop;

public class Kendaraan {

    public static void main(String[] args) {
        Car mobil = new Car("Pertalite");
        mobil.warna();
        mobil.mesin();
        System.out.println("bahannya: " + mobil.getBahanBakar());
        System.out.println("tahunn pembuatan: " + mobil.getTahunPembuatan());
    }
}