package com.juaracoding.oop.inheritance;

public class Karyawan {

    String name;
    String address;
    double salary;

    public double tax (double tax){
        return salary*tax;
    }
}
